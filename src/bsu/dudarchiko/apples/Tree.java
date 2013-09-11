package bsu.dudarchiko.apples;

import java.util.Random;

public class Tree {
	private int applesCount;

	public Tree() {
	}

	public void grow() {
		Random rand = new Random();
		applesCount += rand.nextInt();
	}

	public void shake() {
		Random rand = new Random();
		applesCount += rand.nextInt(applesCount);
	}

}
