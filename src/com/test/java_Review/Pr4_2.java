package com.test.java_Review;

class Pr4_2 {
	public static void main(String [] args) {
		int sum = 0;
		for(int x = 0; x <= 20; x++) {
			if(x%2 == 0 || x%3 == 0) {
			} else {
				sum += x;
				System.out.println(x + "," + sum);
			}
		}
	}

}
