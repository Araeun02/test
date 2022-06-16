package com.test.java;

public class PrRe6_17 {
	public static int[] shuffle(int[] arr) { //왜 shuffle(int[] arr)의 형태가 되었나?
		for(int x = 0; x < arr.length; x++) {
			int y = (int)(Math.random()*arr.length);
			int tmp = arr[x];
			arr[x] = arr[y];
			arr[y] = tmp;
		}
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		int [] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}