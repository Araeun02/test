package com.test.java;

public class Ex5_6 {
	public static void main(String[] args) {
		String[] names = {"Kim","Park","Yi"};
		
		for(int i =0; i < names.length; i++)
			System.out.println("name["+i+"]:"+names[i]);
		
		String tmp = names[2];
		System.out.println("tmp:"+tmp);
		names[0] = "Yu";
		
		for(int i = 0; i < names.length; i++)
			System.out.println(names[i]);
	}

}
