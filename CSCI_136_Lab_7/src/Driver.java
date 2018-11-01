import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Driver extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Player image and position
		Player myPlayer = new Player();
		Image player = new Image(myPlayer.getPlayerImg());
		ImageView viewPlayer = new ImageView(player);
		int playerX = myPlayer.setPlayerXPosition();
		int playerY = myPlayer.setPlayerYPosition();
		viewPlayer.setLayoutX(playerX);
		viewPlayer.setLayoutY(playerY);
		
		//Enemy image and position
		Enemy myEnemy = new Enemy();
		Image enemy = new Image(myEnemy.getEnemyImg());
		ImageView viewEnemy = new ImageView(enemy);
		int enemyX = myEnemy.setEnemyXPosition();
		int enemyY = myEnemy.setEnemyYPosition();
		viewEnemy.setLayoutX(enemyX);
		viewEnemy.setLayoutY(enemyY);
		viewEnemy.setFitHeight(190);
		viewEnemy.setFitWidth(150);
		
		//Items and their positions
		Items myItems = new Items();
		Image item1 = new Image(myItems.getItem1Img());
		ImageView viewItem1 = new ImageView(item1);
		int item1X = myItems.setItemXPosition();
		int item1Y = myItems.setItemYPosition();
		viewItem1.setLayoutX(item1X);
		viewItem1.setLayoutY(item1Y);
		
		//Rest Button
		Button reset = new Button("Restart");
		reset.setLayoutX(740);
		reset.setLayoutY(15);
        
        //Button Action
        reset.setOnAction(e -> {
        	viewPlayer.setLayoutX(myPlayer.setPlayerXPosition());
        	viewPlayer.setLayoutY(myPlayer.setPlayerYPosition());
        	
        	viewEnemy.setLayoutX(myEnemy.setEnemyXPosition());
        	viewEnemy.setLayoutY(myEnemy.setEnemyYPosition());
        	
        	viewItem1.setLayoutX(myItems.setItemXPosition());
        	viewItem1.setLayoutY(myItems.setItemYPosition());
        });
		
		Group myGroup = new Group(viewPlayer, viewEnemy, viewItem1, reset); //the group of objects that will be added to the window
		Scene background = new Scene(myGroup, 800, 600, Color.WHITE);
		
		primaryStage.setTitle("Game"); //title of window in the window's bar
		primaryStage.setScene(background); //implements the "scene" (objects/background)
		primaryStage.show(); //shows the window (would probably not appear w/o it)
	}
}
