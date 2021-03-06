package application;
import backend.User;
	
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import backend.SavingCalculator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


/** Main class that runs GUI */

public class Main extends Application {
	
	int counter = 0;
	boolean checked = false;
	User newUser;
	SavingCalculator newSavCalc;
	
	public Main()
	{
		newUser = new User();
		newSavCalc = new SavingCalculator();
		this.counter = 0;
	}
	
	
	/** specified constructor for Main class 
	 * @param aName - name of user
	 * @param anIncome - income of user
	 * @param someExpenses - expenses of user
	 * @param someSavings - savings of user
	 * */
	
	public Main(String aName, double anIncome, ArrayList<Double> someExpenses, double someSavings)
	{
		newUser = new User(aName, anIncome, someExpenses);
		newSavCalc = new SavingCalculator(aName, anIncome, someExpenses, someSavings);
		checked = false;
        counter = 0;
	}
	

	
	/** start method will set stage for GUI  */

	@Override
	public void start(Stage primaryStage) throws IOException {
	
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
			Text scenetitle = new Text("Welcome to Budgy!");
			scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			p.add(scenetitle, 0, 0, 2, 1);
			Text sceneSubTitle = new Text("Please enter the following:");
			sceneSubTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
			p.add(sceneSubTitle, 0, 1, 2, 1);
			
			try {
				
				Label money = new Label("                                        $");
				Label nameLabel = new Label("Name: ");
		     	p.add(nameLabel, 0, 2);
		     	TextField nameText = new TextField();
		     	nameText.setText("Anonymous");
		     	newUser.setName("Anonymous");
		     	p.add(nameText, 1, 2);

		        
		     	Label income = new Label("Income:");
		     	p.add(income, 0, 3);
		     	p.add(money, 0, 3);
		        TextField incomeText = new TextField();
		        incomeText.setText("0.0");
		        newUser.setIncome(0.0);
		        p.add(incomeText, 1, 3);
	        
		
		        Button addExp=new Button("+");
		        p.add(addExp, 3, 4);
		        Label expense = new Label("Add Expense:");
		        Label money2 = new Label("                                        $");
		        p.add(expense, 0, 4);
		        p.add(money2, 0, 4);
		        
		        Label checkBox = new Label("Create save file?");
		        CheckBox check = new CheckBox();
		        p.add(checkBox, 0, 5);
		        p.add(check, 1, 5);
		        
		        check.setOnAction(e ->
		        {
		        	if(check.isSelected())
		        	{
		        	checked = true;
		        	}
		        	
		        	else
		        	{
		        	checked = false;
		        	}
		        }
		        );
		        
		     
		        ArrayList<TextField> textFields = new ArrayList<TextField>();
		        
		        for (int index = 0; index < 100; index++)
		        {
		        	TextField tF = new TextField(String.valueOf(index+1));
		        	tF.setText("0.0");
		        	textFields.add(tF);;	
		        }
		        
		        
		        p.add(textFields.get(this.counter), 1, 4);
		        newUser.addExpense(0.0);

		        addExp.setOnAction(e -> 
		        {
		    		try 
		    		{
			        	
			        		
			        		if (!((Double.valueOf(textFields.get(this.counter).getText())) >=0)) //check that user input is a positive number
		    				{  
		    					newUser.addExpense(0.0);
		    					System.out.println("Expense input was not a positive number. Set to 0.0 by default. ");
		    				}
			        		
			        		else{newUser.addExpense(Double.valueOf(textFields.get(this.counter).getText()));}
		    		} 
		    		
		    		catch (NumberFormatException f) //catch exceptions if not a number
		    		{   
		    			newUser.addExpense(0.0);
		    			System.out.println("Expense input was not a number. Set to 0.0 by default. ");
		    		}
		        	this.counter++;
		        	p.add(textFields.get(this.counter), 1, 4);

		        });

		        Button calcSav = new Button("Calculate Savings");
		        p.add(calcSav, 1, 6);
				GridPane q = new GridPane();		
				Scene scene3 = new Scene(q,600,500);
				
		        calcSav.setOnAction(e -> 
		        {		
		        	if (nameText.getText().isEmpty()) //check if user input for name is empty
						{      
						newUser.setName("Anonymous");
						System.out.println("Name input was left empty. Set to 'Anonymous' by default. ");
						
						}
		        	
					else{newUser.setName(nameText.getText());}
					
					try 
					{
						
						if (!(Double.valueOf(incomeText.getText()) >=0)) //check that user input is a positive number
						{  
							newUser.setIncome(0.0);
							System.out.println("Income input was not a positive number. Set to 0.0 by default. ");
		    			}
		    			
						else {newUser.setIncome(Double.valueOf(incomeText.getText()));}
								
						} 
		    		
					catch (NumberFormatException f) //catch exceptions if not a number
					{   
						newUser.setIncome(0.0);
						System.out.println("Income input was not a number. Set to 0.0 by default. ");
					}
						
					try 
					{
						if (!((Double.valueOf(textFields.get(this.counter).getText())) >=0)) //check that user input is a positive number
		    			{  
		    				newUser.addExpense(0.0);
		    				System.out.println("Expense input was not a positive number. Set to 0.0 by default. ");
		    			}
			        	
						else {newUser.addExpense(Double.valueOf(textFields.get(this.counter).getText()));}
					} 
		    		
					catch (NumberFormatException f) //catch exceptions if not a number
					{   
						newUser.addExpense(0.0);
						System.out.println("Expense input was not a number. Set to 0.0 by default. ");
					}
					
					if(checked == true)
					{
					
						try 
						{
							FileWriter writer = new FileWriter("Budgy.txt",false);
							BufferedWriter bWriter = new BufferedWriter(writer);
							
							bWriter.write("Budgy Results \n \nName: " + newUser.getName() + "\nIncome: $" 
							+ String.valueOf(newUser.getIncome()) + "\nExpenses: $" 
							+ String.valueOf(newUser.totalExp(newUser.getExpense())) + "\nTotal Savings: $" 
							+ String.valueOf(newSavCalc.totalSavings(newUser.getExpense(), newUser.getIncome())) 
							+ "\n \nThanks for choosing us!");
							
							bWriter.close();
						}
						
						catch (IOException e1) 
						{
							e1.printStackTrace(); 
						}
					}
		    		
		  
		        	
		        	primaryStage.setScene(scene3);

					q.setAlignment(Pos.CENTER);
					q.setHgap(10);
					q.setVgap(10);
					q.setPadding(new Insets(25, 25, 25, 25));
					Text results = new Text("Results:");
					results.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
					q.add(results, 0, 0, 2, 1);
					Text scene3Title = new Text("Hi " + newUser.getName() + "...");
					scene3Title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
					q.add(scene3Title, 0, 2, 2, 1);
					Text scene3SubTitle = new Text("...you saved..." );
					scene3SubTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
					q.add(scene3SubTitle, 0, 3, 2, 1);
					Text scene3SubTitle2 = new Text("$" + Double.toString(newSavCalc.totalSavings(newUser.getExpense(), newUser.getIncome())));
					scene3SubTitle2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
					q.add(scene3SubTitle2, 0, 4, 2, 1);
					Text scene3SubTitle3 = new Text("...this month");
					scene3SubTitle3.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
					q.add(scene3SubTitle3, 0, 5, 2, 1);});
		        
		        Button done = new Button("Done");
		        q.add(done, 1, 8);
		        
		        done.setOnAction(e -> 
		        {
		        	  System.exit(0);
		        	 
		        });

			primaryStage.setScene(scene);
			primaryStage.show();

			} catch(Exception e) {
				e.printStackTrace();
			}
			

	}
	
	/** used to run GUI */
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
