package com.test.java;
import java.io.*;

class Ex15_8 {
	public static void main(String [] args) {
		try {
			String fileName = "abc.txt";
			FileInputStream fis = new FileInputStream(fileName);
			FileReader fr = new FileReader(fileName);
			
			int data = 0;
			while((data = fis.read()) != -1)
				System.out.print((char)data);
			System.out.println();
			fis.close();
			
			data = 0;
			while((data = fr.read()) != -1)
				System.out.print((char)data);
			System.out.println();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
