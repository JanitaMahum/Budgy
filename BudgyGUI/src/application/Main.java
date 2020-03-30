package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
			FirstController n = new FirstController();
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("First.fxml"));			
			Scene scene = new Scene(root,600,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
			Button getStarted = (Button) root.getChildren().get(4);
			//getStarted.addEventHandler(MouseEvent.MOUSE_CLICKED, new FirstController(getStarted));
			//AnchorPane p= new AnchorPane((AnchorPane)FXMLLoader.load(getClass().getResource("NameMenu.fxml")));
			GridPane p = new GridPane();
			Scene scene2= new Scene(p ,600,500);

			getStarted.setOnAction(e -> primaryStage.setScene(scene2));   
			p.setAlignment(Pos.CENTER);
			p.setHgap(10);
			p.setVgap(10);
			p.setPadding(new Insets(25, 25, 25, 25));
			Text scenetitle = new Text("Enter information");
			scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			p.add(scenetitle, 0, 0, 2, 1);
			
			Label nameLabel = new Label("Name: ");
			p.add(nameLabel, 0, 1);
			TextField nameText = new TextField();
			p.add(nameText, 1, 1);
			Button addIncome = new Button("Add Income");
			p.add(addIncome, 3, 2);
			Label income = new Label("Income ");
			p.add(income, 0, 2);
			TextField incomeText = new TextField();
			p.add(incomeText, 1, 2);
			Button addFix=new Button("Add Fixed Expense");
			p.add(addFix, 3, 3);
			Label fixed = new Label("Monthly Expense: ");
			p.add(fixed, 0, 3);
			TextField fixedText = new TextField();
			p.add(fixedText, 1, 3);
			Button addVar= new Button("Add variable Expense");
			p.add(addVar, 3, 4);
			Label var = new Label("Variable Expense: ");
			p.add(var, 0, 4);
			Button finish=new Button("Finish");
			p.add(finish, 1, 6);
			TextField varText = new TextField();
			p.add(varText, 1, 4);
				finish.setOnAction(e -> 
				{
					String userName = nameText.getText();
					System.out.println(userName);
				}
			);
			/*p.setHgap(8);
	        p.setVgap(8);
	        p.setPadding(new Insets(5));
	        
	        ColumnConstraints cons1 = new ColumnConstraints();
	        cons1.setHgrow(Priority.NEVER);
	        p.getColumnConstraints().add(cons1);

	        ColumnConstraints cons2 = new ColumnConstraints();
	        cons2.setHgrow(Priority.ALWAYS);
	        
	        p.getColumnConstraints().addAll(cons1, cons2);
	        
	        RowConstraints rcons1 = new RowConstraints();
	        rcons1.setVgrow(Priority.NEVER);
	        
	        RowConstraints rcons2 = new RowConstraints();
	        rcons2.setVgrow(Priority.ALWAYS);  
	        
	        p.getRowConstraints().addAll(rcons1, rcons2);
	        
	        Label lbl = new Label("Name:");
	        TextField field = new TextField();
	        ListView view = new ListView();
	        Button okBtn = new Button("OK");
	        okBtn.setOnAction(new EventHandler<ActionEvent>() {
	        	@Override
	    	   	public void handle(ActionEvent event)
	    	   	{
	        		System.out.println("works");
	    	   	}
	        });
	        Button closeBtn = new Button("Close");

	        GridPane.setHalignment(okBtn, HPos.RIGHT);

	        p.add(lbl, 0, 0);
	        p.add(field, 1, 0, 3, 1);
	        p.add(view, 0, 1, 4, 2);
	        p.add(okBtn, 2, 3);
	        p.add(closeBtn, 3, 3);
			  */
			primaryStage.setScene(scene);
			primaryStage.show();
			//Button next = (Button)root.getChildren().get(2);
	    	//AnchorPane root1=(AnchorPane)FXMLLoader.load(getClass().getResource("NameMenu.fxml"));
	    	//primaryStage.getScene().setRoot(root1);

			/*Button next = (Button)root1.getChildren().get(2);
			 next.setOnAction(new EventHandler<ActionEvent>()
			   {
			   	@Override
			   	public void handle(ActionEvent event)
			   	{
			   		System.out.println("next");
			   	}
			   }
			  );*/

			//next.addEventHandler(MouseEvent.MOUSE_DRAGGED, new FirstController(next));

	}
				
		//next.addEventHandler(MouseEvent.MOUSE_DRAGGED, handler);
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
