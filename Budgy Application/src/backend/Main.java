package backend;

/** Main class that runs back-end */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/** Main class will instantiate user input and use other classes to run application back-end */

public class Main { 

	public static void main(String args[]) throws IOException
	{
		User newUser = new User();
		
		SavingCalculator savings = new SavingCalculator();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Budgy! \n \nWould you like a file created to save your data? (Type 'Y' for yes)"
				+ "\nOr if would you would like an already existing file to be read, please type 'y'. "
				+ "\nIf you would like to start a new session without a file being created, please type 'N'");

		String answer = input.nextLine();
		
		while (!answer.contentEquals("Y") && !answer.contentEquals("y") && !answer.contentEquals("N") && !answer.contentEquals("n"))
		{System.out.println("Invalid entry, please use 'Y', 'N', 'y' or 'n'.");
		answer = input.nextLine();}
		
		if(answer.contentEquals("Y"))
		{BudgyWriter.writingToBudgy();}
		
		if(answer.contentEquals("y"))
		{BudgyReader.budgyScanner();}
		
		if(answer.contentEquals("N") || answer.contentEquals("n"))
		{System.out.println("Hi " + newUser.nameInput() + ", your total savings this month is $" + 
		savings.totalSavings(newUser.expInput(), newUser.incomeInput()) + ".");}

	}
}