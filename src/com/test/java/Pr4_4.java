package com.test.java;

public class Pr4_4 {
	public static void main(String [] args) {
		int sum = 0;
		//int i = 0;
		/*while(sum <= 100) {
			i++;
			if(i%2 == 0) { // 짝수
				sum -= i; //sum = sum - i
			} else if (i%2 != 0) { // 홀수
				sum += i; //sum = sum + i
			}
			System.out.println(sum);
		}
		System.out.println(i);*/
		
		int buho = -1;
		for (int j=1; sum<=100; j++) {
			buho = buho * -1;
			sum += (j * buho);
			System.out.printf("%5d, %d%n", sum, j*buho);
		}
		System.out.println(sum);
	}
}
