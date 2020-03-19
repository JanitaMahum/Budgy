//package Budgy; 
//import Budgy.Transaction; 
import java.util.ArrayList; 
import java.util.Scanner;
//import Budgy.Transaction;

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

