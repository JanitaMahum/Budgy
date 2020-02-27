import java.util.ArrayList;

public class fixExpense {
	
//private ArrayList<Double> fixExpense;

public ArrayList<Double> getFixExpense() 
{
	return fixExpense;
}

public void setFixExpense(ArrayList<Double> fixExpense) {
	this.fixExpense = fixExpense;
}

public ArrayList<Double> addfixExpense(double fixExpense)
{
	this.fixExpense.add(fixExpense);
	
	return this.fixExpense;
}
	
public ArrayList<Double> delFixExpense(double fixExpense)
{
	this.fixExpense.remove(fixExpense);
		
	return this.fixExpense;
	
}

public double totalFixExpense(ArrayList<Double> fixExpense)
{
	double totalFixExpense = 0;
	
	for(int index = 0; index < fixExpense.size(); index++) 
	{totalFixExpense += fixExpense.get(index);}
	
	return totalFixExpense;
}
}

