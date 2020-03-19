package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("First.fxml"));			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
			Button getStarted = (Button) root.getChildren().get(4);
			getStarted.addEventHandler(MouseEvent.MOUSE_CLICKED, new FirstController(getStarted));
			primaryStage.setScene(scene);
			primaryStage.show();
			root=(AnchorPane)FXMLLoader.load(getClass().getResource("NameMenu.fxml"));
			scene=new Scene(root);
			Button next = (Button) root.getChildren().get(2);
			next.addEventHandler(MouseEvent.MOUSE_DRAGGED, new FirstController(next));
		} catch(Exception e) {
			e.printStackTrace();
		}
		//next.addEventHandler(MouseEvent.MOUSE_DRAGGED, handler);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
