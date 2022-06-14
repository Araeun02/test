package com.test.java;

public class practice5_4 {
	public static void main(String[] args) {
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int sum = 0;
		int total = 0;
		float average = 0;
		
		for(int x=0; x<arr.length; x++) {
			sum += arr[0][x];
			System.out.println(sum);
			for(int y=0; y<arr.length; y++)
				total += arr[x][y];
				average = sum/((float)arr[x][])*((float)arr[][y])
		}
		
		System.out.println("total="+total);
		System.out.println("average="+average);
	}

}
