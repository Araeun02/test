package com.test.java;
import java.util.*;

class Pr11_4 {
	public static void main(String [] args) {
		ArrayList<Student00> list = new ArrayList<Student00>();
		list.add(new Student00("이자바", 2, 1, 70, 90, 70));
		list.add(new Student00("안자바", 2, 2, 60, 100, 80));
		list.add(new Student00("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student00("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student00("김자바", 1, 2, 80, 80, 90));
		
		Collections.sort(list, new BanNoAscending());
		Iterator<Student00> it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}
}
