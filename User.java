import java.util.ArrayList;
import java.util.Scanner; 

	public class User {
		
	protected String name;
	protected Double income;
	protected ArrayList<Double> varExpense;
	protected ArrayList<Double> fixExpense;
	protected double savings;
		
	public void nameInput()
	{
		this.name = "Anonymous";
		System.out.println("Enter your name: ");
		Scanner nameInput = new Scanner(System.in);
		this.name = nameInput.nextLine();
		//nameInput.close();
	}
		
	public void income()
	{
		System.out.println("Enter your income per month: ");
		Scanner incomeInput = new Scanner(System.in);
		this.income = incomeInput.nextDouble();
		//incomeInput.close();
			
	}
		
	public void varExpense()
	{
		ArrayList<Double> varE = new ArrayList<Double>();
		System.out.println("Enter a new variable expense for the month: ");
		Scanner varInput = new Scanner(System.in);
		double newInput = varInput.nextDouble();
			
		while(newInput != 0.0)
		{
			varE.add(newInput);
			System.out.println("Enter a new variable expense for the month or enter 0.0 to quit: ");
			newInput = varInput.nextDouble();
		}
		
		this.varExpense = varE;
		//varInput.close();
	}
		
	public void fixExpense()
	{
		ArrayList<Double> fixE = new ArrayList<Double>();
		System.out.println("Enter a new monthly expense: ");
		Scanner fixInput = new Scanner(System.in);
		double newInput = fixInput.nextDouble();
			
		while(newInput != 0.0)
		{
			fixE.add(newInput);
			System.out.println("Enter a new monthly expense or enter 0.0 to quit: ");
			newInput = fixInput.nextDouble();
		}
		
		this.fixExpense = fixE;
		
			
		//fixInput.close();
	}
	
	public void getSavings()
	{
		double totalFixExpense = 0.0;
		double totalVarExpense = 0.0;
		
		for(int index = 0; index < fixExpense.size(); index++) 
		{totalFixExpense += fixExpense.get(index);}
		
		for(int index = 0; index < varExpense.size(); index++) 
		{totalVarExpense += varExpense.get(index);}
		
		savings = income - totalFixExpense - totalVarExpense;
		
		this.savings = savings;
		
	}

	public static void main(String args[]) {
		User newUser = new User();
		newUser.nameInput();
		newUser.income();
		newUser.varExpense();
		newUser.fixExpense();
		newUser.getSavings();
		System.out.println("Hi " + newUser.name + ", your total savings this month is $" + newUser.savings + ".");
		
	}

}
