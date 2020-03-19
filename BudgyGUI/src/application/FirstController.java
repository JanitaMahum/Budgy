package application;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FirstController implements EventHandler{
	TextField aName;
    Button getStarted;

     public FirstController(Button getStarted) {
    	 this.getStarted = getStarted;
	}
     public FirstController(TextField next) {
    	 
     }
    


	@Override
	public void handle(Event arg0) {
		System.out.println("get started");
		Stage primaryStage;
	    AnchorPane root;

	    primaryStage=(Stage)getStarted.getScene().getWindow();
	    try {
			root=(AnchorPane)FXMLLoader.load(getClass().getResource("NameMenu.fxml"));
			Scene scene=new Scene(root);
			 primaryStage.setScene(scene);
			 primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	  
		
	}
	

}

