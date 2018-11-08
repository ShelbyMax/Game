import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EndScreen {

	public Scene Ending(Stage primaryStage, Scene gameScreen, Scene start){

		//Score Text
		Text finalScores = new Text("Scores: Add variables here");
		finalScores.setScaleX(2);	finalScores.setScaleY(2);
		finalScores.setX(515); 	finalScores.setY(150);

		//Label, text-field, and button to enter player name
		Label entryLabel = new Label("Enter Name: ");
		entryLabel.setLayoutX(385); entryLabel.setLayoutY(370);
		entryLabel.setScaleX(1.25);	entryLabel.setScaleY(1.25);

		TextField enterName = new TextField();
		enterName.setLayoutX(500); enterName.setLayoutY(365);
		enterName.setScaleX(1.15);  enterName.setScaleY(1.15);

		Button enter = new Button("Enter"); 
		enter.setLayoutX(725); enter.setLayoutY(365);
		enter.setScaleX(1.15);  enter.setScaleY(1.15);
		//Needs to add name variable to score method
		enter.setOnAction(e -> { 
			String playerName = enterName.getText();

			//Clear TextFields for new information when added
			enterName.clear();
		});

		//Play Again Button (goes back to the game screen)
		Button play = new Button("Play Again");
		play.setOnAction(e -> {primaryStage.setScene(gameScreen);});
		play.setLayoutX(550);	play.setLayoutY(475);
		play.setScaleX(3);		play.setScaleY(3);

		//Play Again Button (goes back to the game screen)
		Button startMenu = new Button("Start Menu");
		startMenu.setOnAction(e -> {primaryStage.setScene(start);});
		startMenu.setLayoutX(550);	startMenu.setLayoutY(625);
		startMenu.setScaleX(3);		startMenu.setScaleY(3);

		//Credits Text
		Text credits = new Text("Developers: N. Crepeau & S. Max" +
				"\nImages: www.gaiaonline.com");
		credits.setX(950); 	credits.setY(750);

		//The group of objects that will be added to the window
		Group root = new Group(finalScores, entryLabel, enterName, enter, play, startMenu, credits);
		Scene end = new Scene(root, 1200, 800, Color.LIGHTSEAGREEN);
		return end; //Returns code to use to set the scene
	}

}
