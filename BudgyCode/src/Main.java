
	//package Budgy;

	import java.util.ArrayList;

	public class Main { private String name; private Double income; private ArrayList varExpenses; private ArrayList fixExpenses; private double savings;

	public Main()
	{
		User newUser = new User(this.name,this.income,this.savings);
		Transaction expenses = new Transaction(this.varExpenses, this.fixExpenses);
	}

	public static void main(String args[])
	{
		User newUser = new User() ;
		System.out.println("Hi " + newUser.nameInput() + ", your total savings this month is $" + 
		newUser.totalSavings(newUser.addVarExpense(), newUser.addFixExpense(), newUser.incomeInput()) + ".");
	}
	}

