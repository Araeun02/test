package com.test.java;

class Data_1 { //기본 생성자 추가
	int value;

}

class Data_2 { // int x 라는 값이 정해져있기에 기본 생성자가 추가되지 않음
	int value;
	
	Data_2(int x){
		value = x;
	}
	
	Data_2() { // 생성자의 기본 형태
		
	}
	
}


class Ex6_11 { //public 이 없다
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); //의도된 에러 Data_2 is undefined 생성자 Data_2()가 정의되어 있지 않음 
	}
}
