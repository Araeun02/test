package com.test.java;

public class Pr6_3 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:" + s.name); // 여기서 this를 못쓰는 이유는 this의 경우에는 같은 클래스의 다른 생성자를 호출할 때 사용하기 때문 
		System.out.println("총점:" + s.getTotal()); // 그래서 위에서 Student s = new Student();를 사용해서 호출한것
		System.out.println("평균:" + s.getAverage());
	}

}
