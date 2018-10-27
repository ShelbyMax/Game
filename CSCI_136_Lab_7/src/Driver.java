import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Driver extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		int x = 400; //x-coordinate of where the image will start
		int y = 400; //y-coordinate of where the image will start
		String words = "hi";
		Text message = new Text(x, y, words); //input numbers and string for position and text
		
		Group myGroup = new Group(message); //the group of objects that will be added to the window
		Scene background = new Scene(myGroup, 800, 600, Color.WHITE);
		
		primaryStage.setTitle("Game"); //title of window in the window's bar
		primaryStage.setScene(background); //implements the "scene" (objects/background)
		primaryStage.show(); //shows the window (would probably not appear w/o it)
	}
}
