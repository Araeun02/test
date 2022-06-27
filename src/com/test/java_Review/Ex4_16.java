package com.test.java_Review;

public class Ex4_16 {
	public static void main(String [] args) {
		int sum = 0;
		int i = 0;
	
		while(true) { //true가 거짓이 될 때 까지
			if(sum > 100) //(1) 105 > 100의 조건을 만족하면서
				break; //break가 활성화되면서 나감 
			++i;
			sum += i;
			System.out.print(i);
			System.out.println(sum); //14번째 시행에 sum의 값이 105가 되면서 (1)으로
		}
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}
}
