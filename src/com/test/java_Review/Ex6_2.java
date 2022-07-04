package com.test.java_Review;

class Ex6_2 {
	public static void main(String [] args) {
		Tv06 t1 = new Tv06();
		Tv06 t2 = new Tv06();
		System.out.println("t1의 channel의 값은 " + t1.channel + "입니다."); // channel의 기본값은 0 그래서 0으로 출력됨
		System.out.println("t2의 channel의 값은 " + t2.channel + "입니다.");
		
		t1.channel = 7; 
		System.out.println("t1의 channel의 값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t1의 channel값은 " + t2.channel + "입니다.");
	}

}
