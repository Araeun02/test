package com.test.java;

public class EX4_2 {
	public static void main(String[] args) {
		int x = 0;
		System.out.printf("x=%d 일때, 참인 것은%n",x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)"); // (!(x!=0)) = x==0
		
		x = 1;
		System.out.printf("x=%d 일 때, 참인 것은 %n",x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)"); //x가 0이 이라면의! 즉 x가 0이 아니라면
		if(!(x!=0)) System.out.println("!(x!=0)");		
	}

}
