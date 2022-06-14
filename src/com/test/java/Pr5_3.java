package com.test.java;

public class Pr5_3 {
	public static void main(String[] args)
	{
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		for(int x =0; x<arr.length;x++) {
			sum += arr[x];
		}
		
		System.out.println(sum);
	}

}
