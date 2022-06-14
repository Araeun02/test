package com.test.java;

public class Pr4_3 {
	public static void main(String [] args) {
		int sum = 0;
		int allsum = 0; 
		for(int x = 1; x <= 10; x++) {
			sum += x;
			allsum += sum;
			System.out.println(sum);
		}
		System.out.println(allsum);
			
	}

}
