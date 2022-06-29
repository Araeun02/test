package com.test.java;
import java.util.*;

class Ex11_5 {
	public static void main(String [] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) { //다음에 줄이 있다면 계속 없으면 종료
			String obj = it.next(); //형변환
			System.out.println(obj.charAt(0));
		}
	}

}
