package com.test.java;

public class Pr5_4 {
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
		
		/*for(int x=0; x<arr.length; x++) {
			sum += arr[0][x];
			System.out.println(sum);
			for(int y=0; y<arr[x].length; y++)
				total += arr[x][y];
			average = sum/((float)arr[x][])*((float)arr[][y])
		}
		
		System.out.println("total="+total);
		System.out.println("average="+average);
		*/
		
		int length = 0;
		for (int i=0; i<arr.length; i++) {
			length += arr[i].length;
			for (int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		average = sum / (float)(arr.length * arr[0].length);
		
		System.out.println("total="+sum);
		System.out.println("average="+average);
		
		
	}

}