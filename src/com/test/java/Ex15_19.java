package com.test.java;

public class Ex15_19 implements java.io.Serializable {
	String name;
	String password;
	int age;
	
	public Ex15_19() {
		this("Unknown", "1111", 0);
	}
	
	public Ex15_19(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	public String toString () {
		return "(" + name + "," + password + "," + age + ")";
	}



}
