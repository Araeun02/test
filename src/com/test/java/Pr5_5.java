package com.test.java;

public class Pr5_5 {
	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i = 0; i< ballArr.length;i++) { //ballArr = 9
			int j = (int)(Math.random()* ballArr.length); //+1해야 0이 안나오는거 아닌가?
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;	

		}
		
		//ball3 = ballArr[0]+ballArr[1]+ballArr[2];
		
		for(int i = 0; i<ball3.length;i++) {
			ball3[i] = ballArr[i];  
		}
		
		for(int i = 0; i<ball3.length;i++) {
			System.out.print(ball3[i]); 
		}
		
	}

}
