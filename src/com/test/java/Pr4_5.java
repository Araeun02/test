package com.test.java;

public class Pr4_5 {
	public static void main(String[] args) {
		/*int i = 0;
		int j = 0;
		while(i<=10) { //for 반복 횟수가 정해져 있음 // while 특정 조건을 만족할때까지 루프
			i++;
			while(j<=i)
				j++;
				System.out.print("*");
			System.out.println();
			}
		}*/
		
		int i=0;
		while (i<=10) {
			int j = 0;
			while (j<=i) {
				System.out.print("*");
				
				j++;
			}
			System.out.println();
			
			i++;
		}

                                

	}

}
