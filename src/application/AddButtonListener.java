package application;
import javafx.event.Event;
import javafx.event.EventHandler;
/**
* This is the AddButton class which adds a button. Extends method Button.
* @param Label name.1
* @return name.
*/
public class AddButtonListener implements EventHandler{
	@Override
	/**
	* This is the handle method which handles the event of the add button.
	* @param Event event
	* @return Nothing.
	*/
	public void handle(Event event)
	{
		 event.setOnAction(e -> 
	        {
	        });
	}

}
