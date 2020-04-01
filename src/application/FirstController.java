package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FirstController implements EventHandler{
	TextField aName;
    Button getStarted;
    Button next;
    AnchorPane root1;
     public FirstController(Button getStarted) {
    	 this.getStarted = getStarted;
	}
     public FirstController() {
    	 
     }
     public FirstController(TextField next) {
    	 
     }
    


	@Override
	public void handle(Event arg0) {
		System.out.println("get started");
		Stage primaryStage;
	    AnchorPane root1;

	    primaryStage=(Stage)getStarted.getScene().getWindow();
	    try {
	    	root1=(AnchorPane)FXMLLoader.load(getClass().getResource("NameMenu.fxml"));
			this.next = (Button) root1.getChildren().get(2);

	    	primaryStage.getScene().setRoot(root1);

		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	public AnchorPane getRoot() {
		return root1;
	}
	  public Button getNext() {
		  return this.next;
	  }
}

