package com.test.java;
import java.util.*;

class Ex12_2 {
	public static void main(String [] args) {
		ArrayList<Student6> list = new ArrayList<Student6>();
		list.add(new Student6("자바왕", 1, 1));
		list.add(new Student6("자바짱", 1, 2));
		list.add(new Student6("홍길동", 2, 1));
		
		Iterator<Student6> it = list.iterator();
		while(it.hasNext()) {
			Student6 s = it.next();
			System.out.println(s.name);
		}
	}

}

class Student6 {
	String name = "";
	int ban;
	int no;
	
	Student6(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}