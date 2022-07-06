package com.test.java;
import java.io.*;
import java.util.ArrayList;

public class Ex15_20 {
	public static void main(String [] args) {
		try {
			String fileName = "UserInfo.ser";
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			Ex15_19 u1 = new Ex15_19("JavaMan", "1234", 30);
			Ex15_19 u2 = new Ex15_19("JavaWoman", "4321", 26);
			
			ArrayList<Ex15_19> list = new ArrayList<>();
			list.add(u1);
			list.add(u2);
			
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list);
			out.close();
			System.out.println("직렬화가 잘 끝났습니다.");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
