package com.test.java;
import java.util.Scanner;

public class Ex4_4 {
	public static void main(String[] args) {
		int score =0;
		char grade =' ';
		
		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score>=90) { //90이상
			grade = 'A';
		} else if(score>=80) { // 90 미만 80이상
			grade = 'B';
		} else if(score>=70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("당신의 학점은 "+ grade +"입니다.");
			//70점 이상에서 작동안함
			
			
				
	}
	

}
