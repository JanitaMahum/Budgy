package backend;

import java.util.ArrayList;
import java.util.Scanner;
/**
* This is the User class which documents the user.
*/
public class User {
	private String name;
	private Double income;
	private ArrayList<Double> expenses;
	/**
	* This is the User constructor method which copies the variables. 
	* @param User toCopy.
	* @return Nothing.
	*/
	public User(User toCopy) {
		this.name = toCopy.name;
		this.income = toCopy.income;
		this.expenses = toCopy.expenses;
	}
	/**
	* This is the User constructor method which initializes the variables. 
	* @param String aName, double anIncome, ArrayList<Double> someExpenses.
	* @return Nothing.
	*/
	public User(String aName, double anIncome, ArrayList<Double> someExpenses) {
		this.name = aName;
		this.income = anIncome;
		this.expenses = someExpenses;
	}
	/**
	* This is the User constructor method. 
	* @param Nothing.
	* @return Nothing.
	*/
	public User() {
		// TODO Auto-generated constructor stub
	}
	/**
	* This is the name getter method which initializes name. 
	* @param String args[].
	* @return text.
	*/
	public String getName() {
		return this.name;
	}
	/**
	* This is the name setter method which initializes the name. 
	* @param String aName.
	* @return text.
	*/
	public void setName(String aName) {
		this.name = aName;
	}
	/**
	* This is the nameInput method which asks for and takes the username input and returns name. 
	* @param Nothing.
	* @return name.
	*/
	public String nameInput() {

		Scanner nameInput = new Scanner(System.in);
		System.out.println("Enter your name: ");

		this.name = nameInput.nextLine();

		while (this.name.isEmpty()) {

			System.out.println("Name cannot be blank");
			System.out.println("Enter your name: ");

			this.name = nameInput.nextLine();

		}
		return this.name;
	}
	/**
	* This is the incomeInput method which asks for and takes the income input and returns income. 
	* @param Nothing.
	* @return userInput.
	*/
	public Double incomeInput() {

		Scanner incomeInput = new Scanner(System.in);
		
		Double userInput = 0.0;
		
		while(true) {
			
			System.out.println("Enter your income per month: ");
			
			try {
				userInput = Double.parseDouble(incomeInput.next());
				
				while (!(userInput >=0)) {
					
					System.out.println("Income must be a positive number!");
					System.out.println("Enter your income per month: ");

					userInput = Double.parseDouble(incomeInput.next());	
				}
				
				break;
			
			} catch (NumberFormatException e) {
				
				System.out.println("Income must be a number!");
				
			}			
		}
		
		return this.income = userInput;
	}
	/**
	* This is the income getter method. 
	* @param Nothing.
	* @return income.
	*/
	public double getIncome() {
		return this.income;
	}
	/**
	* This is the income setter method. 
	* @param double anIncome.
	* @return Nothing.
	*/
	public void setIncome(double anIncome) {
		this.income = anIncome;
	}
	/**
	* This is the expInput method which asks for and takes the expense or expenses input and returns expenses.
	* Catches errors in user input 
	* @param Nothing.
	* @return expenses.
	*/
	public ArrayList<Double> expInput() {
		
		Scanner input = new Scanner(System.in);
		
		double userexpInput = 0.0;
		
		while (true) {
			
			System.out.println("Enter a new expense: ");
			
			try {
				
				userexpInput = Double.parseDouble(input.next());
				
				while (!(userexpInput >= 0)) {
					
					System.out.println("Expense must be a positive number!");
					
					System.out.println("Enter a new expense: ");
					userexpInput = Double.parseDouble(input.next());	
				}
				
				if (this.expenses == null) {
					this.expenses = new ArrayList<Double>();
				}
				this.expenses.add(userexpInput);

				while (0 != userexpInput) {
					System.out.println("Enter a new expense or enter zero to quit: ");
					userexpInput = Double.parseDouble(input.next());
					
					while (!(userexpInput >= 0)) {
						
						System.out.println("Expense must be a positive number!");
						
						System.out.println("Enter a new expense: ");
						userexpInput = Double.parseDouble(input.next());	
					}
					
					this.expenses.add(userexpInput);
				}
				
				break;
				
			} catch (NumberFormatException e) {
				
				System.out.println("Expense must be a number!");
				
			}
		}
		return this.expenses;
	}
	/**
	* This is the expense setter method. 
	* @param ArrayList<Double> anExpense.
	* @return Nothing.
	*/
	public void setExpense(ArrayList<Double> anExpense) {
		this.expenses = anExpense;
	}
	/**
	* This is the expense getter method. 
	* @param Nothing.
	* @return expense.
	*/
	public ArrayList<Double> getExpense() {
		return expenses;
	}
	/**
	* This is the add expense method which adds expenses to each other. 
	* @param Double anExpense.
	* @return expenses.
	*/
	public ArrayList<Double> addExpense(Double anExpense) {
		this.expenses.add(anExpense);
		return this.expenses;
	}
	/**
	* This is the total expense method that calculates total expense and uses addExpense method. 
	* @param ArrayList<Double> anExpense.
	* @return totalExp.
	*/
	public double totalExp(ArrayList<Double> someExpenses) {
		double totalExp = 0;
		for (int index = 0; index < someExpenses.size(); index++) {
			totalExp += someExpenses.get(index);
		}
		return totalExp;
	}

}