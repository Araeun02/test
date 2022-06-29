package com.test.java;
import java.util.*;

class Ex11_13 {
	public static void main(String [] args) {
		Set set = new TreeSet();
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);
		}
		//정렬이 빠짐(TreeSet)은 자동정렬
		System.out.println(set);
	}

}
//Ex11_10이랑 같이 볼것