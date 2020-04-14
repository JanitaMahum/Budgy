package backend;

import java.util.ArrayList;

public class SavingCalculator extends User{
	
	double savings;
	
	public SavingCalculator(String aName, double anIncome, ArrayList<Double> someExpenses, double someSavings)
	{
		super(aName,anIncome,someExpenses);
		this.savings = someSavings;
	}
	
	public SavingCalculator() {
		// TODO Auto-generated constructor stub
	}

	public double getSavings()
	{
		return this.savings;
	}
	
	public double totalSavings(ArrayList<Double> someExpenses, Double anIncome)
	{
		double someSavings = anIncome - super.totalExp(someExpenses);
		this.savings = someSavings;
		return this.savings;
	}

}
