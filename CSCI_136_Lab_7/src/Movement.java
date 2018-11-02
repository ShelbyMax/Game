import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Movement {
	
	private ImageView viewPlayer;
	private int x = 550, y = 600;
	
	public void setMovement(int x, int y, ImageView viewPlayer){
		this.viewPlayer = viewPlayer;
		this.x = x;
		this.y = y;
	}
	
	public void playerMovement(Scene gameScreen) {
		gameScreen.setOnKeyPressed(this::listenUp);
	}
	
	public void listenUp(KeyEvent event)
	{
		KeyCode myCode = event.getCode();
		
		if(myCode == KeyCode.LEFT)
		{
			x-=10;
		}
		else if(myCode == KeyCode.RIGHT)
		{
			x+=10;
		}
		else if(myCode == KeyCode.DOWN)
		{
			y+=10;	
		}
		else if(myCode == KeyCode.UP)
		{
			y-=10;
		}
		
		viewPlayer.setX(x);
		viewPlayer.setY(y);
	}
	
	public void enemyMovement() {
		
	}

}
