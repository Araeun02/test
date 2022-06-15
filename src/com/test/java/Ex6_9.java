package com.test.java;

class MyMath2 {
	long a, b; // a,b는 인스턴스 변수
	int c;
	
	long add() {return a+b;} //인스턴스 매서드
	long subtract() {return a - b;}
	long multiply() {return a * b;}
	double divide() {return a / b;}
	
	static long add(long a,long b) {
		MyMath2 m = new MyMath2();
		System.out.println(m.c);
		return a + b;
	}
	static long subtract(long a, long b) {return a - b;} //클래스 (static) 매서드
	static long multiply(long a, long b) {return a * b;} //매개 변수 a,b(지역변수)
	static double divide(long a, long b) {return a / (double)b;}
} // 공통의 값을 유지해아 하는 것 = static 각각의 다른 값은 가져야한다면 인스턴스
  
public class Ex6_9 {
	public static void main(String args[]) {
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L)); // 왜 오류?
		System.out.println(MyMath2.divide(200L, 100L));
		
		MyMath2 mm = new MyMath2(); // 인스턴스를 생성
		mm.a = 200L; // 인스턴스 매서드는 객체생성이 필요함
		mm.b = 100L;
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}

}
