
public class Savings {
  
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

}
