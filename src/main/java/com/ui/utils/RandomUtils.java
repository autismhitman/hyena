package com.ui.utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
	
	
	public static int getValue(int size) {
		 
		return ThreadLocalRandom.current().nextInt(0,size);
		
	}

}
