package com.test.java;

public class Ex9_10 {
	public static void main(String [] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal); //valueOf는 입력받은 값을 지정된 객체로 형변환하여 다시 반환한다. 모든 형태로 변환 될 수 있다.
		double dVal = 200.0;
		String strVal2 = dVal + "";
		double sum = Integer.parseInt("+" + strVal)+ Double.parseDouble(strVal2);//parseInt 문자를 정수(int)로 변환,parseDouble 문자를 소수(double)형태로 변환
		double sum2 = Integer.valueOf(strVal)+ Double.valueOf(strVal2); //Integer
		
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
	}

}
//int는 기본형(int, double, float 등등), Integer은 참조형이고 int의 래퍼클래스(박싱)