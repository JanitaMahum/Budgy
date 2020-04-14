package application;

import java.awt.Label;

import backend.SavingCalculator;
import backend.User;
/**
* This is the AddLabel class which creates and adds the label. Extends from class Label.
* @param Label name.1
* @return name.
*/
public class AddLabel extends Label{
	/**
	* This is the  AddLabel method.
	* @param Nothing.
	* @return Nothing.
	*/
	AddLabel()
	{
		
	}
	/**
	* This is the  label method which makes use of Label method to create a Label.
	* @param Label name.
	* @return name.
	*/
	public Label newLabel(Label name)
	{
		name = new Label();
		return name;
	}

	/**
	 * This is the final label method which makes use of SavingCalculator method to create a Label.
	 * @param Nothing.
	 * @return javafx.scene.control.Label.
	 */
	public static javafx.scene.control.Label finalLabel()
	{
		User newUser = new User();
		SavingCalculator savings = new SavingCalculator();
		return new javafx.scene.control.Label("Hi " + newUser.getName() + " you have saved a total of " + savings.totalSavings(newUser.getExpense(), newUser.getIncome()) + " this month.");
	}

}
