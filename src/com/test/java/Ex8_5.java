package com.test.java;

public class Ex8_5 {
		public static void main(String [] args) {
			System.out.println(1);
			System.out.println(2);
			try {
				System.out.println(3);
				System.out.println(0/0); //예외발생
				System.out.println(4);
			} catch (ArithmeticException ae) {
				ae.printStackTrace();
				System.out.println("예외 메세지 :" + ae.getMessage());
			} 
			System.out.println(6);
		}
}
//왜 순서가 다름?