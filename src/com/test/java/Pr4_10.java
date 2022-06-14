package com;

public class Pr4_10 {
	public static void main(String[] args)
	{
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요 :");
			input = s.nextInt();
			
			if(input>answer) {
				System.out.println("더 작은 수 입니다.");
			} else if(input<answer) {
				System.out.println("더 큰 수 입니다.");
			
			} else if(input==answer) {
				System.out.println("정답");
				System.out.println("시도 횟수는 "+count+"입니다.");
			}
				
			
			
			
		} while(true);
	}

}