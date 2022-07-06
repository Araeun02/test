package com.test.java;
import java.io.*;
import java.util.ArrayList;

public class Ex15_21 {
	public static void main(String [] args) {
		try {
			String fileName = "UserInfo.ser";
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			ObjectInputStream in = new ObjectInputStream(bis);
			
			Ex15_19 u1 = (Ex15_19)in.readObject();
			Ex15_19 u2 = (Ex15_19)in.readObject();
			ArrayList list = (ArrayList)in.readObject();
			
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
