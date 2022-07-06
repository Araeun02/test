package com.test.java;
import java.io.*;

class Ex15_6 {
	public static void main(String [] args) {
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			for(int i = '1'; i <= '9'; i++) {
				bos.write(i);
			}
			
			bos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
