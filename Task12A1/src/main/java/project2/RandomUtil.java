package project2;

import java.util.Random;

public class RandomUtil {
	
	private final static Random RANDOM = new Random();
	private final static int DEFAULT_BOUND = 10;  
	
	private RandomUtil() {
		
	}
	
	public static int getRandom() {
		return RANDOM.nextInt(DEFAULT_BOUND);
	}
	
	public static int getRandom(int bound) {
		return RANDOM.nextInt(bound);
	}
}
