import java.util.Random;

public class Items {
	private String itemImgPath;
	private double pointsPerItem;
	
	public String getItem1Img() {
		return "file:src/Amethyst.png";
	}
	
	public String getItem2Img() {
		return "file:src/Diamond.png";
	}
	
	public String getItem3Img() {
		return "file:src/Emerald.png";
	}
	
	public String getItem4Img() {
		return "file:src/Ruby.png";
	}
	
	public String getItem5Img() {
		return "file:src/Sapphire.png";
	}
	
	public String getItem6Img() {
		return "file:src/Topaz.png";
	}
	
	public int setItemXPosition() {
		Random myRand = new Random();
		//Used to generate two random integers between 1 and 1150
		int randomNumber = myRand.nextInt(1150)+1;
		
		return randomNumber;
	}
	
	public int setItemYPosition() {
		Random myRand = new Random();
		//Used to generate two random integers between 1 and 750
		int randomNumber = myRand.nextInt(750)+1;
		
		return randomNumber;
	}
	
	public double setItemWorth() {
		return 0.0;
	}

}