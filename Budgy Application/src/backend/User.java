package backend;
import java.util.ArrayList;
import java.util.Scanner;

/** This class will be the blue print for all required user related information */

public class User 
{

	private String name;
	private double income;
	private ArrayList<Double> expenses;
	
	/** copy constructor for User class */

	public User(User toCopy) 
	{
		this.name = toCopy.name;
		this.income = toCopy.income;
		this.expenses = toCopy.expenses;
	}
	
	/** specified constructor for User class 
	 * @param aName - name of user
	 * @param anIncome - income of user
	 * @param someExpenses - expenses of user
	 * */

	public User(String aName, double anIncome, ArrayList<Double> someExpenses) 
	{
		this.name = aName;
		this.income = anIncome;
		this.expenses = someExpenses;
	}

	public User() 
	{
		// TODO Auto-generated constructor stub
	}

	public String getName() 
	{
		return this.name;
	}

	public void setName(String aName) 
	{
			this.name = aName;
	}

	/** nameInput will take users name and check to validate that user input is correct 
	 * @return name - user input for name
	 * */
	
	public String nameInput() 
	{

		Scanner nameInput = new Scanner(System.in);
		System.out.println("Enter your name: ");

		this.name = nameInput.nextLine();
		setName(this.name);

		while (this.name.isEmpty()) {      //check if user input for name is empty

			System.out.println("Name cannot be blank");
			System.out.println("Enter your name: ");

			this.name = nameInput.nextLine();
			setName(this.name);

		}
		return this.name;
	}
	
	/** incomeInput will take users input for income and check to validate that it is correct
	 * @return income - user input for income
	 *  */

	public double incomeInput() 
	{

		Scanner incomeInput = new Scanner(System.in);
		
		Double userInput = 0.0;
		
		while(true) {  //check that user input is a number(double)
			
			System.out.println("Enter your income per month: ");
			
			try {
				userInput = Double.parseDouble(incomeInput.next());
				setIncome(userInput);
				
				while (!(userInput >=0)) {  //check that user input is a positive number
					
					System.out.println("Income must be a positive number!");
					System.out.println("Enter your income per month: ");

					userInput = Double.parseDouble(incomeInput.next());	
					setIncome(userInput);
				}
				
				break;
			
			} catch (NumberFormatException e) {   //catch exceptions if not a number
				
				System.out.println("Income must be a number!");
				
			}			
		}
		
		return this.income = userInput;
	}
	

	public double getIncome() 
	{
		return this.income;
	}

	public void setIncome(double anIncome) 
	{
		this.income = anIncome;
		
	}

	
	/** expInput will take users input for expenses and check to validate that they are correct
	 * @return expenses - user input for expenses
	 *  */
	
	public ArrayList<Double> expInput() 
	{
		
		Scanner input = new Scanner(System.in);
		
		double userexpInput = 0.0;
		
		while (true) {  //check that user input is a number(double)
			
			System.out.println("Enter a new expense: ");
			
			try {
				
				userexpInput = Double.parseDouble(input.next());
				
				while (!(userexpInput >= 0)) {   //check that user input is a  positive number
					
					System.out.println("Expense must be a positive number!");
					
					System.out.println("Enter a new expense: ");
					userexpInput = Double.parseDouble(input.next());	
				}
				
				if (this.expenses == null) {
					this.expenses = new ArrayList<Double>();
				}
				addExpense(userexpInput);

				while (0 != userexpInput) {   //continue to add expenses for user if 0 has not been entered
					System.out.println("Enter a new expense or enter zero to quit: ");
					userexpInput = Double.parseDouble(input.next());
					
					while (!(userexpInput >= 0)) {   //check that user input is a positive number
						
						System.out.println("Expense must be a positive number!");
						
						System.out.println("Enter a new expense: ");
						userexpInput = Double.parseDouble(input.next());	
					}
					
					addExpense(userexpInput);
				}
				
				break;
				
			} catch (NumberFormatException e) {
				
				System.out.println("Expense must be a number!");
				
			}
		}
		return this.expenses;
	}

	public void setExpense(ArrayList<Double> anExpense) 
	{
		this.expenses = anExpense;
	}

	public ArrayList<Double> getExpense() 
	{
		return this.expenses;
	}

	
	/** addExpense will add user expense to arrayList
	 * @param anExpense - input for expense 
	 * @return expenses - expense to add to arrayList
	 *  */
	
	public ArrayList<Double> addExpense(double anExpense)
	{
		if (this.expenses == null) 
	    {
			this.expenses = new ArrayList<Double>();
		}
			
		this.expenses.add(anExpense);
		return this.expenses;
	}
	
	
	/** totalExp will add up all user expenses
	 * @param someExpenses - input for expense 
	 * @return totalExp - all user expenses added up
	 *  */

	public double totalExp(ArrayList<Double> someExpenses) {
		double totalExp = 0;
		for (int index = 0; index < someExpenses.size(); index++) {
			totalExp += someExpenses.get(index);
		}
		return totalExp;
	}

}