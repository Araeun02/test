package com.test.java;
import java.util.*;

class Ex10_4 {
	public static void main(String [] args) {
		Calendar date = Calendar.getInstance();
		date.set(2019,7, 31);
		
		System.out.println(toString(date));
		System.out.println(" = 1일 후 =");
		date.add(Calendar.DATE,1);//add(int field, int amount)
		System.out.println(toString(date));
		
		System.out.println("= 6달 전 =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		System.out.println("= 31일 후(roll) =");
		date.roll(Calendar.DATE,31);//roll은 add와 똑같지만 다른 필드에 영향을 주지 않음
		System.out.println(toString(date));
		
		System.out.println("= 31일 후(add) =");
		date.add(Calendar.DATE,31);//roll에서 31일을 더하면 다음 일의 최대 값을 넘어가지못하지만 add의 경우에는 다음달로 넘어간 4월 1일이 출력
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+ "년" + (date.get(Calendar.MONTH) +1) +"월" + date.get(Calendar.DATE) + "일"; 
	}

}
