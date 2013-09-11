package bsu.dudarchiko.apples;

import java.util.Random;

public class Tree {
	private int applesCount;
	private int flowerCount;

	public Tree() {
	}

	public void grow() {
		applesCount += flowerCount;
		flowerCount = 0;
	}

	public void shake() {
		Random rand = new Random();
		applesCount += rand.nextInt(applesCount);
	}
	
	public void bloom(){
		Random rand = new Random();
		flowerCount += rand.nextInt();
	}

}
