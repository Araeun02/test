package com.test.java;

public class Ex9_1 {
	public static void main(String [] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) //equals는 주소값을 비교
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}
}

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
}

