package application;
	
import java.awt.event.ActionListener;
import java.io.IOException;

import application.User;
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
	
	int counter = 0;
	
	public Main() {
		
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		
		User newUser = new User();
			FirstController n = new FirstController();
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("First.fxml"));			
			Scene scene = new Scene(root,600,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
			Button getStarted = (Button) root.getChildren().get(4);
			GridPane p = new GridPane();
			Scene scene2= new Scene(p ,600,500);

			getStarted.setOnAction(e -> primaryStage.setScene(scene2));   
			p.setAlignment(Pos.CENTER);
			p.setHgap(10);
			p.setVgap(10);
			p.setPadding(new Insets(25, 25, 25, 25));
			Text scenetitle = new Text("Pleae enter the following information:");
			scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			p.add(scenetitle, 0, 0, 2, 1);
			
			 Label nameLabel = new Label("Name: ");
		     	p.add(nameLabel, 0, 1);
		     	TextField nameText = new TextField();
		     	p.add(nameText, 1, 1);
		     	
		     	
		        
		     Label income = new Label("Income: ");
		     	p.add(income, 0, 2);
		        TextField incomeText = new TextField();
		        p.add(incomeText, 1, 2);
		        
		
		        Button addExp=new Button("+");
		        p.add(addExp, 3, 3);
		        Label expense = new Label("Add Expense: ");
		        p.add(expense, 0, 3);
		        TextField expenseText = new TextField();
		        p.add(expenseText, 1, 3);
		        
		        TextField newExpText = new TextField();
		        
		        addExp.setOnAction(e -> 
		        {
		        	
		    
		            p.add(newExpText, 1, 4);
		            Button addExp2=new Button("+");
			        p.add(addExp2, 3, 4);
			        Label expense2 = new Label("Add Expense: ");
			        p.add(expense2, 0, 4);
			        TextField expenseText2 = new TextField();
			        p.add(expenseText2, 1, 4);
			        
			        TextField newExpText2 = new TextField();
			        
			        addExp2.setOnAction(d -> 
			        {
			        
			    
			            p.add(newExpText2, 1, 5);
			        Button addExp3=new Button("+");
		        p.add(addExp3, 3, 5);
		        Label expense3 = new Label("Add Expense: ");
		        p.add(expense3, 0, 5);
		        TextField expenseText3 = new TextField();
		        p.add(expenseText3, 1, 5);
		        
		        TextField newExpText3 = new TextField();
		        
		        addExp3.setOnAction(f -> 
		        {
		        	
		            p.add(newExpText3, 1, 6);
		            Button addExp4=new Button("+");
		        p.add(addExp4, 3, 6);
		        Label expense4 = new Label("Add Expense: ");
		        p.add(expense4, 0, 6);
		        TextField expenseText4 = new TextField();
		        p.add(expenseText4, 1, 6);
		        
		        TextField newExpText4 = new TextField();
		        
		        addExp4.setOnAction(g -> 
		        {
		        	
		            p.add(newExpText4, 1, 7);
		            Button addExp5=new Button("+");
		        p.add(addExp5, 3, 7);
		        Label expense5 = new Label("Add Expense: ");
		        p.add(expense5, 0, 7);
		        TextField expenseText5 = new TextField();
		        p.add(expenseText5, 1, 7);
		        
		        TextField newExpText5 = new TextField();
		     
		        addExp5.setOnAction(h -> 
		        {
		  
		        		});

		        });

		        });

			        });

		        });
 
			Button finish=new Button("Finish");
			p.add(finish, 1, 10);
			
			Label endLabel = new Label("Hi " + newUser.getName() + " you have saved a total of " + newUser.getSavings() + " this month.");
			Button done = new Button("Done");
			
			finish.setOnAction(e -> 
			{
		     newUser.setName(nameText.getText());
			 newUser.setIncome(Double.valueOf(incomeText.getText())); 
			 newUser.addExpense(Double.valueOf(expenseText.getText()));
		     p.add(endLabel, 0, counter+7);
		     p.add(done, 1, counter+8);
			});
		
			
			done.setOnAction(e -> 
			{
				primaryStage.setScene(scene);
			});
			
			primaryStage.setScene(scene);
			primaryStage.show();


	}
				

	
	public static void main(String[] args) {
		launch(args);
	}
}
