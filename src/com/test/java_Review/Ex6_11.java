package com.test.java_Review;

class Data_1 {
	int value;
}

class Data_2 {
	int value;
	
	Data_2(int x){
		value = x;
	}

	public Data_2() {} // 생성자
}

class Ex6_11 {
	public static void main(String [] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();
	}
}
