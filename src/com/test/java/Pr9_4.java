package com.test.java;

class Pr9_4 {
	public static boolean contains(String src, String target) {
		return src.indexOf(target) != -1;
		
		/*if(src.indexOf(target)!=-1) {
			return true;
		} else {
			return false;
		}*/
	}
	
	public static void main(String [] args) {
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
	}

}
//맞게쓴건가?