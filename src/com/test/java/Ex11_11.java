package com.test.java;
import java.util.*;

class Ex11_11 {
	public static void main(String [] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person00("David",10));
		set.add(new Person00("David",10));
		
		System.out.println(set); //왜 David:10은 동일하게 인식하지 않았는가?
	}
}

class Person00 {
	String name;
	int age;
	
	Person00(String name, int age){//생성자
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" +age;
	}
}
