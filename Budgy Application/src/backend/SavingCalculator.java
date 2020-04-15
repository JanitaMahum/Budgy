package backend;

import java.util.ArrayList;

/** This class extends from User and will calculate savings for the user */

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
	
	/** totalSavings method will calculate total savings using given inputs from user 
	 * @param someExpenses - expenses of user
	 * @param anIncome - income of user 
	 * @return savings - total savings of user as a double 
	 * */
	
	public double totalSavings(ArrayList<Double> someExpenses, Double anIncome)
	{
		double someSavings = anIncome - super.totalExp(someExpenses);
		this.savings = someSavings;
		return this.savings;
	}

}
