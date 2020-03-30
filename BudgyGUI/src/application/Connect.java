package application;

import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Connect extends Main{
	TextField text;
	public Connect(TextField text) {
		this.text=text;
		String s = text.getText();
	}
	public static void main(String args[]) {
		Main m= new Main();
		
		//System.out.println(s);
	}
}
