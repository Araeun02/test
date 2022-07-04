package com.test.java_Review;

class Pr5_4 {
	public static void main(String [] args) {
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		
		int total = 0;
		float average = 0;
		int count = 0;
		
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr[x].length; y++) {
				total += arr[x][y];
				count++;
			}
		}
		
		System.out.println("count = " + count);
		
		average = (float)total / count;
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	}

}
