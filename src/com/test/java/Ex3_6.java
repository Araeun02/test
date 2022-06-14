package com.test.java;

public class Ex3_6 {
	public static void main(String args[]) {
		int a = 10;
		int b = 4;
		String c = "HHH";
		
		System.out.println("a = " + a + ", b = " + b);
		
		System.out.printf("a = %d, b = %d, c = %s%n", a, b, c);
		
		System.out.printf("%d + %d = %d%n", a,b, a + b);
		System.out.printf("%d - %d = %d%n", a,b, a - b);
		System.out.printf("%d * %d = %d%n",  a,b, a * b);
		System.out.printf("%d / %d = %d%n", a,b, a / b);
		System.out.printf("%d / %f = %f%n", a,(float)b, a/(float)b);
	}

}
