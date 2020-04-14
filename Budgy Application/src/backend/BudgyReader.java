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
				User newUser = new User();
				BufferedReader reader = new BufferedReader(new FileReader("Budgy.txt"));
				int counter = 1; 
				String line = reader.readLine();

			
				while (line != null)  
				{
					line = reader.readLine();
					System.out.println(line);
				
					if (2 < counter && counter < 7)
						{System.out.println(line);
						line.split(":",1);}
				
					if (counter == 3)
						{String[] lineData = line.split("Name:");
						for (String x : lineData) 
							{newUser.setName(x);}}

					if (counter == 5)
						{String[] lineData = line.split("Total Savings:");
						for (String x : lineData) 
							{System.out.println("Hi " + newUser.getName() + 
							", your total savings this month is $" + x + ".");}}
				
					counter++;
				}
	
				
			reader.close();
		}



	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		budgyScanner();
	}
}




