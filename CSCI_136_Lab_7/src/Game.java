
public class Game {
	private double highscore1;
	private double highscore2;
	private double highscore3;
	private double playerScore;
	private String playerName;
	
	public String getName() {
		return "";
	}
	
	public double getScore() {
		return 0.0;
	}
	
	public String scoresToString() {
		return "1. " + highscore1 +
				"2. " + highscore2 +
				"3. " + highscore3 +
				playerName+ " " + playerScore;
	}

}
