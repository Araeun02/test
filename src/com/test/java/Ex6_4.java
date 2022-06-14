package com.test.java;

public class Ex6_4 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L,3L);
		long result2 = mm.subtract(5L,3L);
		long result3 = mm.multiply(5L,3L);
		double result4 = mm.divide(5L,3L);
		
		System.out.println("add(5L,3L)= "+result1);
		System.out.println("subtract(5L,3L) = "+result2);
		System.out.println("multiply(5L,3L) = "+result3);
		System.out.println("divide(5L,3L) = "+result4);
	}

}
class MyMath {
	long add(long a, long b) { //int i=5, j=5; 처럼 공통의 변수 타입을 적더라도 생략이 불가능 //long add(long a long b)로 다 적어야함 값을 따로 받을 필요가 없다면 ()
		long result = a+b; //long add(long a, long b) {return a+b;}
		return result; //반환타입이 void라면 생략 가능하다. 하지만 해당 경우는 void가 아니므로 생략이 불가능하다.
	}
	long subtract(long a,long b) {return a-b;}
	long multiply(long a,long b) {return a*b;}
	double divide(double a,double b) {return a / b;}
}
