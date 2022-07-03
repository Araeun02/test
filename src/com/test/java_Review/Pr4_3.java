package com.test.java_Review;

class Pr4_3 {
	public static void main(String [] args) {
		int sum = 0;
		int sumAll = 0;
		for(int x=0; x <= 10; x++) {
			sum += x;
			System.out.println("sum = " + sum);
			sumAll += sum;
			System.out.println("sumAll = " + sumAll);
		}
	}

}
