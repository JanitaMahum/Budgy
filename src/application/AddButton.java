package application;

import javafx.scene.control.Button;
/**
* This is the AddButton class which adds a button. Extends method Button.
* @param Label name.1
* @return name.
*/
public class AddButton extends Button {
	/**
	* This is the AddButton method which adds a button. Extends method Button.
	* @param Nothing.
	* @return Nothing.
	*/
	public AddButton()
	{
		super();
	}
	/**
	* This is the getButton method which gets a button. Extends method Button.
	* @param Button name,String label.
	* @return name.
	*/
	public Button getButton(Button name,String label)
	{
		return name = new Button(label);
	}

}
