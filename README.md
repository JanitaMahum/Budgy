#Budgy-

package Budgy;

import java.util.ArrayList;

public class Main
{
	private String name;
	private Double income;
	private ArrayList<Double> varExpenses;
	private ArrayList<Double> fixExpenses;
	private double savings;
	
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
	
	public User()
	{
		this.name = name;
		this.income = income;
		this.varExpenses = varExpenses;
		this.fixExpenses = fixExpenses;
		this.savings = savings;
	}
	
	public User(User toCopy)
	{
		this.name = toCopy.name;
		this.income = toCopy.income;
		this.varExpenses = toCopy.varExpenses;
		this.fixExpenses = toCopy.fixExpenses;
		this.savings = toCopy.savings;
	}
	
	public User(String aName, double anIncome, double someSavings)
	{
		this.name = aName;
		this.income = anIncome;
		this.savings = someSavings;
		Transaction expenses = new Transaction(this.varExpenses, this.fixExpenses);
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
	
	public double totalSavings(ArrayList<Double> varExpenses,ArrayList<Double> fixExpenses,double income)
	{
		Transaction expenses = new Transaction(varExpenses,fixExpenses);
		double someSavings = this.income - expenses.totalVarExp(varExpenses) - expenses.totalFixExp(fixExpenses);
		this.savings = someSavings;
		return this.savings;
	}
	
	public double getSavings()
	{
		return this.savings;
	}

	public double getIncome() 
	{
		return this.income;
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

	public ArrayList<Double> varExpInput()
	{
		System.out.println("Enter a new variable expense: ");
		Scanner expInput = new Scanner(System.in);
		double newInput = expInput.nextDouble();
		if (this.varExpenses == null) {this.varExpenses = new ArrayList<Double>();}
		this.varExpenses.add(newInput);

		return this.varExpenses;
	}
	
	public ArrayList<Double> fixExpInput()
	{
		System.out.println("Enter a new fixed expense: ");
		Scanner expInput = new Scanner(System.in);
		double newInput = expInput.nextDouble();
		if (this.fixExpenses == null) {this.fixExpenses = new ArrayList<Double>();}
		this.fixExpenses.add(newInput);

		return this.fixExpenses;
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
		varExpInput();
		
		return this.varExpenses;
	}
		
	public ArrayList<Double> delVarExpense(double anExpense)
	{
		this.varExpenses.remove(anExpense);
			
		return this.varExpenses;
		
	}
	
	public ArrayList<Double> addFixExpense()
	{
		fixExpInput();;
		
		return this.fixExpenses;
	}
		
	public ArrayList<Double> delFixExpense(double anExpense)
	{
		this.fixExpenses.remove(anExpense);
			
		return this.fixExpenses;
		
	}

	public double totalVarExp(ArrayList<Double> varExpenses)
	{
		double totalExp = 0;
		
		for(int index = 0; index < varExpenses.size(); index++) 
		{totalExp += varExpenses.get(index);}
		
		return totalExp;
	}
	
	public double totalFixExp(ArrayList<Double> fixExpenses)
	{
		double totalExp = 0;
		
		for(int index = 0; index < fixExpenses.size(); index++) 
		{totalExp += fixExpenses.get(index);}
		
		return totalExp;
	}

}
