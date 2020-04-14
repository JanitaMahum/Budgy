package backend;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


/** This class will take user input and write it to a file */

public class BudgyWriter 
{	
	public static void writingToBudgy() throws  IOException
	{
		User newUser = new User();
		SavingCalculator savings = new SavingCalculator();
		
		File budgyFile = new File("Budgy.txt");

		  if (!budgyFile.exists()) {
			  budgyFile.createNewFile();}
		  
		FileWriter writer = new FileWriter("budgy.txt");
	    BufferedWriter bWriter = new BufferedWriter(writer);

	    bWriter.write("Budgy Results \n \nName: " + newUser.nameInput() + "\nIncome: $" 
	    + String.valueOf(newUser.incomeInput()) + "\nExpenses: $" 
	    + String.valueOf(newUser.totalExp(newUser.expInput())) + "\nTotal Savings: $" 
	    + String.valueOf(savings.totalSavings(newUser.getExpense(), newUser.getIncome())) 
	    + "\n \nThanks for choosing us!");
	    
	    System.out.println("Hi " + newUser.getName() + ", your total savings this month is $" + 
	    		savings.totalSavings(newUser.getExpense(), newUser.getIncome()) + ". \nPlease refer to"
	    		+ " Budgy.txt on your computer if you would like to review your data.");

	    bWriter.close();
	}

	public void main(String[] args) throws  IOException 
	{
		writingToBudgy();
	}
}



