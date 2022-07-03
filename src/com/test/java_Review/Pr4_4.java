package com.test.java_Review;

class Pr4_4 {
	public static void main(String [] args) {
		int sum = 0;
		
		for(int x = 1; sum <= 100; x++) {
			if(x%2 != 0) {
				sum += x;
				System.out.println(x + "," + sum);
			} else {
				sum -= x;
				System.out.println("-" + x + "," + sum);
			}
		}
	}

}
