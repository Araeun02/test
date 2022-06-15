package com.test.java;

public class Pr6_17 {
	
	
	
	public static void main(String[] args) {
		int [] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int [] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
