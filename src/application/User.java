package application;

import java.util.ArrayList;

public class User{

	private String name;
	private double income;
	private ArrayList<Double> expenses;
	private double savings;

	public User(User toCopy)
	{
		this.name = toCopy.name;
		this.income = toCopy.income;
		this.expenses = toCopy.expenses;
		this.savings = toCopy.savings;
	}

	public User(String aName, double anIncome, double someSavings,ArrayList<Double> someExpenses )
	{
		this.name = aName;
		this.income = anIncome;
		this.savings = someSavings;
		this.expenses = someExpenses;
	}

	public User() {
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
	

	public double totalSavings(ArrayList<Double> expenses,double income)
	{
		double someSavings = this.income - totalExp();
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

	public ArrayList<Double> getExpense() 
	{
	return this.expenses;
	}

	public void setExpense(ArrayList<Double> anExpense) 
	{
		this.expenses = anExpense;
	}

	public ArrayList<Double> addExpense(Double anExpense)
	{
		if (this.expenses == null) {this.expenses = new ArrayList<Double>();}
		this.expenses.add(anExpense);

		return this.expenses;
	}

	public double totalExp()
	{
		double totalExp = 0;
		for(int index = 0; index < this.expenses.size(); index++) 
		{totalExp += this.expenses.get(index);}
		return totalExp;
	}
}