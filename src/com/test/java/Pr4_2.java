package com;

public class Pr4_2 {
	public static void main(String [] args) {
		int sum = 0;
		int allsum = 0;
		
		for(int x= 1; x<=20; x++) {
			if(x%2 != 0 && x%3 != 0) { 
				sum += x;
				//allsum += sum;

			}
			
			/*if(x%2 == 0 || x%3 == 0) 
				continue;
			
			sum += x;*/
			
			System.out.println(sum);
		}
		System.out.println(allsum);


			
	}

}
