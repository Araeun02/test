package com.test.java;

public class Ex5_7 {
	public static void main(String[] args) {
		System.out.println("매개변수의 개수:"+args.length);
		for(int i = 0; i < args.length; i++) {
			System.out.println("args["+i+"] = \""+args[i]+"\"");
			//System.out.printf("args[%d] = \"%s\"%n", i, args[i]);
		}
	}

}
