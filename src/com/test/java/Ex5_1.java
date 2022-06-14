package com.test.java;
import java.util.Arrays;

public class Ex5_1 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {100,95,80,70,62};
		char[] chArr = {'a','b','c','d'};
		
		for(int i = 0; i < iArr1.length; i++) { //length는 배열의 갯수
			iArr1[i] = i + 1;
		}
		
		for(int i = 0; i<iArr2.length; i++) { // 10이하의 숫자에서 랜덤 10번
			iArr2[i] = (int)(Math.random()*10)+1;
		}
		
		for(int i = 0; i<iArr1.length;i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println(); // 콘솔창에서 한줄 띄어져야되는거 아닌가?
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3); //모르겠음
		System.out.println(chArr);
	}

}
