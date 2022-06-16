package com.test.java;

public class Pr6_20 {
	public static int max(int[] arr) {
		
		if (arr == null || arr.length == 0)
			return -999999;
		
		int max = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		
		return max;
		
		/*int y = 0;
		for(int x = 0; x < arr.length; x++) {
			if(arr == null || arr.length == 0) {
				y = -999999;
			} else if(arr[x]>arr[x-1]) {
				y = arr[x];
		
			}
		}
		return y;*/
	}
	
	
	
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {}));
	}

}
