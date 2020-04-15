package backend;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/** This class will take user input and read it to a file */

public class BudgyReader 
{
	public static void budgyScanner() throws FileNotFoundException, IOException
	{
				try
				
				{User newUser = new User();
				BufferedReader reader = new BufferedReader(new FileReader("Budgy.txt"));
				int counter = 1; 
				String line = reader.readLine();

			
				while (line != null)  
				{
					line = reader.readLine();
				
					if (1 < counter && counter < 7)
						{System.out.println(line);
						line.split(":",1);}
				
					if (counter == 2)
						{String[] lineData = line.split("Name: ");
						for (String x : lineData) 
							{newUser.setName(x);}}

					if (counter == 5)
						{String[] lineData = line.split("Total Savings: ");
						int stringCounter = 1;
						for (String x : lineData) 
							{if (stringCounter == 2)
							{System.out.println("\nHi " + newUser.getName() + 
							", your total savings this month is " + x + ".");}
							stringCounter++;}
						}
				
					counter++;
				}
	
				
			reader.close();}
				
				catch(FileNotFoundException e)
				{
					System.out.println("Sorry, you don't seem to have a Budgy.txt file. Please restart "
							+ "the application and prompt to create a new file. \nIf you ran the application "
							+ "through BudgyReader - backend, make sure to run through Main - backend first.");
				}
		}



	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		budgyScanner();
	}
}




