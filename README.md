# Budgy-

Code (each seperate class) can be found in the master branch

package Budgy;
import Budgy.Transaction;
import Budgy.User;
import Budgy.Interface;

public class Main
{
	
	public void main(String args[])
	{
		User newUser = new User(null);
		newUser.nameInput();
		newUser.incomeInput();
		newUser.getSavings();
		newUser.addVarExpense();
		newUser.addFixExpense();
		System.out.println("Hi " + newUser.getName() + ", your total savings this month is $" + newUser.getSavings() + ".");
	}
	
}

package Budgy;
import Budgy.Transaction;
import java.util.ArrayList;
import java.util.Scanner; 
import Budgy.Transaction;

	public class User {
		
	private String name;
	private Double income;
	private ArrayList<Double> varExpenses;
	private ArrayList<Double> fixExpenses;
	private double savings;
	
	public User(User toCopy)
	{
		this.name = toCopy.name;
		this.income = toCopy.income;
		this.varExpenses = toCopy.varExpenses;
		this.fixExpenses = toCopy.fixExpenses;
		this.savings = toCopy.savings;
	}
	
	//Transaction expense = new Transaction;
//	Transaction.expInput();
	
	public User(String aName, double anIncome, double someSavings, ArrayList<Double> someVarExpenses, ArrayList<Double> someFixExpenses)
	{
		this.name = aName;
		this.income = anIncome;
		this.savings = someSavings;
		Transaction expenses = new Transaction(someVarExpenses,someFixExpenses);
		this.varExpenses = expenses.getVarExpense();
		this.fixExpenses = expenses.getFixExpense();
	}

	public ArrayList<Double> addVarExpense()
	{
		Transaction expenses = new Transaction(varExpenses, fixExpenses);
		return expenses.addVarExpense();
		
	}
	
	public ArrayList<Double> addFixExpense()
	{
		Transaction expenses = new Transaction(varExpenses, fixExpenses);
		return expenses.addFixExpense();
	}

	public String getName()
	{
		return this.name;
	}
	
	public void setName(String aName)
	{
		this.name = aName;
	}
		
	public String nameInput()
	{
		System.out.println("Enter your name: ");
		Scanner nameInput = new Scanner(System.in);
		this.name = nameInput.nextLine();
		return this.name;
	}
		
	public Double incomeInput()
	{
		System.out.println("Enter your income per month: ");
		Scanner incomeInput = new Scanner(System.in);
		this.income = incomeInput.nextDouble();	
		return this.income;
	}
	
	public double getSavings()
	{
		Transaction expenses = new Transaction(this.varExpenses,this.fixExpenses);
		double someSavings = income - expenses.totalVarExp() - expenses.totalFixExp();
		this.savings = someSavings;
		return this.savings;
	}

	public double getIncome() 
	{
		return income;
	}

	public void setIncome(double anIncome) 
	{
		this.income = anIncome;
	}
	
}

package Budgy;
import java.util.ArrayList;
import java.util.Scanner;

public class Transaction {
	
	
	private ArrayList<Double> varExpenses;
	private ArrayList<Double> fixExpenses;
	
	public Transaction(ArrayList<Double> someFixedExpenses,ArrayList<Double> someVariableExpenses)
	{
		this.varExpenses = someFixedExpenses;
		this.fixExpenses = someVariableExpenses;
	}
	
	public Transaction(Transaction toCopy) 
	{
		this.varExpenses = toCopy.varExpenses;
		this.fixExpenses = toCopy.fixExpenses;
	}

	public ArrayList<Double> expInput()
	{
		ArrayList<Double> exp = new ArrayList<Double>();
		System.out.println("Enter a new expense: ");
		Scanner expInput = new Scanner(System.in);
		double newInput = expInput.nextDouble();
		exp.add(newInput);
			
		//while(newInput != 0)
		//{
			//exp.add(newInput);
			//System.out.println("Enter a new expense or enter 0 to quit: ");
			//newInput = expInput.nextDouble();
		//}
		
		return exp;
	}
	
	public ArrayList<Double> getVarExpense() 
	{
		return fixExpenses;
	}

	public void setVarExpense(ArrayList<Double> anExpense) 
	{
		this.varExpenses = anExpense;
	}
	
	public ArrayList<Double> getFixExpense() 
	{
		return fixExpenses;
	}

	public void setFixExpense(ArrayList<Double> someExpenses) 
	{
		this.fixExpenses = someExpenses;
	}

	public ArrayList<Double> addVarExpense()
	{
		varExpenses.addAll(expInput());
		
		return this.varExpenses;
	}
		
	public ArrayList<Double> delVarExpense(double anExpense)
	{
		this.varExpenses.remove(anExpense);
			
		return this.varExpenses;
		
	}
	
	public ArrayList<Double> addFixExpense()
	{
		fixExpenses.addAll(expInput());
		
		return this.fixExpenses;
	}
		
	public ArrayList<Double> delFixExpense(double anExpense)
	{
		this.fixExpenses.remove(anExpense);
			
		return this.fixExpenses;
		
	}

	public double totalVarExp()
	{
		double totalExp = 0;
		
		for(int index = 0; index < varExpenses.size(); index++) 
		{totalExp += varExpenses.get(index);}
		
		return totalExp;
	}
	
	public double totalFixExp()
	{
		double totalExp = 0;
		
		for(int index = 0; index < fixExpenses.size(); index++) 
		{totalExp += fixExpenses.get(index);}
		
		return totalExp;
	}

}

package Budgy;

import java.util.ArrayList;

public class Interface extends User 
{

	public Interface(String aName, double anIncome, ArrayList<Double> varExpenses, ArrayList<Double> fixExpenses,
			double someSavings) {
		super(aName, anIncome, varExpenses, fixExpenses, someSavings);
		// TODO Auto-generated constructor stub
	}
	
}
