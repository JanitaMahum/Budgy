//package Budgy; 
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

