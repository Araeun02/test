package com.test.java;

class Pr9_3 {
	public static int count(String src, String target) {
		int count = 0;
		int pos = 0;
		
		while ((pos = src.indexOf(target, pos)) != -1) {
			count++;
			pos += target.length();
		}
		
		/*int x = src.indexOf(target);
		if(x != -1) {
			count++;
			pos += target.length();
		} else {
			return count;
		}*/
		
		return count;
	}
	
	public static void main(String [] args) {
		System.out.println(count("12345AB345AB", "AB"));
		System.out.println(count("12345","AB"));
	}

}
