package backend;

import java.util.ArrayList;
/**
* This is the main class which runs the back end.
*/
public class Main { 
	/**
	* This is the main method which initializes the variables. 
	* @param String args[].
	* @return text.
	*/
	public static void main(String args[])
	{
		User newUser = new User();
		SavingCalculator savings = new SavingCalculator();
		System.out.println("Hi " + newUser.nameInput() + ", your total savings this month is $" + 
		savings.totalSavings(newUser.expInput(), newUser.incomeInput()) + ".");
	}
}