import java.util.Random;

public class Items {
	private String itemImgPath;
	private double pointsPerItem;
	
	public String getItem1Img() {
		return "file:src/Amethyst.JPG";
	}
	
	public String getItem2Img() {
		return "file:src/Diamond.JPG";
	}
	
	public String getItem3Img() {
		return "file:src/Emerald.JPG";
	}
	
	public String getItem4Img() {
		return "file:src/Ruby.JPG";
	}
	
	public String getItem5Img() {
		return "file:src/Sapphire.JPG";
	}
	
	public String getItem6Img() {
		return "file:src/Topaz.JPG";
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