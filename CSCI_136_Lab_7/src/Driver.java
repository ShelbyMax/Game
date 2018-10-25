import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Driver extends Application{

	public static void main(String[] args) {
		launch(args); //will launch the page (probably wouldn't run code w/o it
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		double x = 100; //x-coordinate of where the text will start
		double y = 200; //y-coordinate of where the text will start
		String words = "hi";
		Text message = new Text(x, y, words); //input numbers and string for position and text
		Group textGroup = new Group(message); //the group of objects that will be added to the window
		int width = 500;
		int height = 800;
		Scene background = new Scene(textGroup, width, height, Color.AZURE);
		//Sets up instructions for: adding the group of objects, setting up window size, and picking window background color
		primaryStage.setTitle("Title in Bar"); //title of window in the window's bar
		primaryStage.setScene(background); //implements the "scene" (objects/background)
		primaryStage.show(); //shows the window (would probably not appear w/o it
	}
}
