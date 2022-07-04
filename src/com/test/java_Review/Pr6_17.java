package com.test.java_Review;

class Pr6_17 {
	public static void main(String [] args) {
		int [] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(java.util.Arrays.toString((original)));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
	
	public static int[] shuffle(int[] arr) {
		for(int x = 0; x < arr.length; x++) {
			int y = (int)(Math.random() * arr.length);
			
			int tmp = arr[x];
			arr[x] = arr[y];
			arr[y] = tmp;
			

		}
		return arr;
	}
	

}