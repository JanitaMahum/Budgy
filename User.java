
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
		nameInput.close();
	}
		
	public void income()
	{
		System.out.println("Enter your income: ");
		Scanner incomeInput = new Scanner(System.in);
		this.income = incomeInput.nextDouble();
		incomeInput.close();
			
	}
		
	public void varExpense()
	{
		System.out.println("Enter a new variable expense: ");
		Scanner varInput = new Scanner(System.in);
		varExpense.add(varInput.nextDouble());
			
		while(varInput.nextLine() != "")
		{
			System.out.println("Enter a new fixed expense or press enter to quit: ");
			varExpense.add(varInput.nextDouble());
		}
			
		varInput.close();
	}
		
	public void fixExpense()
	{
		System.out.println("Enter a new fixed expense: ");
		Scanner fixInput = new Scanner(System.in);
		fixExpense.add(fixInput.nextDouble());
			
		while(fixInput.nextLine() != "")
		{
			System.out.println("Enter a new fixed expense or press enter to quit: ");
			fixExpense.add(fixInput.nextDouble());
		}
			
		fixInput.close();
	}

}
