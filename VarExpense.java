import java.util.ArrayList;

public class VarExpense {
	
//private ArrayList<Double> varExpense;

public ArrayList<Double> getVarExpense() 
{
	return varExpense;
}
//move to expense class
public void setVarExpense(ArrayList<Double> varExpense) {
	this.varExpense = varExpense;
}

//move to expense class
public ArrayList<Double> addVarExpense(double varExpense)
{
	this.varExpense.add(varExpense);
	
	return this.varExpense;
}
//move to expense class
public ArrayList<Double> delVarExpense(double varExpense)
{
	this.varExpense.remove(varExpense);
		
	return this.varExpense;
	
}
//move to expense class
public double totalVarExpense(ArrayList<Double> varExpense)
{
	double totalVarExpense = 0;
	
	for(int index = 0; index < varExpense.size(); index++) 
	{totalVarExpense += varExpense.get(index);}
	
	return totalVarExpense;
}
}
