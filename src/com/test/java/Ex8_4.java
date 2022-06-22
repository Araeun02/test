package com.test.java;

public class Ex8_4 {
	public static void main(String [] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //ArithmeticException
			System.out.println(4);
		} catch (ArithmeticException ae) { //ae? 변수?
			if(ae instanceof ArithmeticException) // 
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e) { //같은 ArithmeticException과 Exception이 있더라도 순서에 따라 생략됨
			System.out.println("Exception"); // ArithmeticException이 먼저 catch됨에 따라 생략됨
		}
		System.out.println(6);
	}

}
