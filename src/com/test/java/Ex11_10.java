package com.test.java;
import java.util.*;

class Ex11_10 {
	public static void main(String [] args) {
		Set set = new HashSet();
		
		for(int i = 0; set.size() < 6; i++) {
			int num =(int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}
		List list = new LinkedList(set);
		Collections.sort(list); //정렬
		System.out.println(list);
	}
}
