package com.test.java;
import java.io.*;

class Ex15_4 {
	public static void main(String [] args) throws IOException{ // Exception은 예외처리
//		FileInputStream fis = new FileInputStream(args[0]);
		FileInputStream fis = new FileInputStream(".\\src\\com\\test\\java\\Ex15_4.java");

		int data = 0;
		
		while((data = fis.read()) != -1) {
			char c = (char)data;
			System.out.print(c);
		}
	}
}
