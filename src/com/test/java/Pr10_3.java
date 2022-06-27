package com.test.java;
import java.util.*;
import java.text.*;

class Pr10_3 {
	static int paycheckCount(Calendar from, Calendar to) {
		if(from == null || to == null) {
			return 0;	
		} else if(from == to && to == 21) { //캘린더나 인트에 알맞는 연산자가 아님? 맞는거같은데 안되는 이유를 모르겠음
			return 1;
		} else if() {//답지는 년도 * 12를 해서 월을 빼는데 그거 말고 다른 방법이 없나?
			return ;
		} else if(fromDate.get(Calendar.DATE) <= 21 && toDate.get(Calendar.DATE) >= 21) {
			++monDiff
		} else if(fromDate.get(Calendar.DATE) > 21 && toDate.get(Calendar.DATE) > 21) {
			--monDiff
		}		
		return monDiff;
	}
	
	static void printResult(Calendar from, Calendar to) {
		Date fromDate = from.getTime();
		Date toDate = to.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		System.out.println(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + ":");
		
		System.out.println(paycheckCount(from,to));
	}
	
	public static void main(String [] args) {
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();
		
		fromCal.set(2020, 0, 1);
		toCal.set(2020, 0, 1);
		printResult(fromCal,toCal); //printResult?
		
		fromCal.set(2020, 0, 21);
		toCal.set(2020, 0, 21);
		printResult(fromCal, toCal);
		
		fromCal.set(2020, 0, 1);
		toCal.set(2020, 2, 1);
		printResult(fromCal, toCal);
		
		fromCal.set(2020, 0, 1);
		toCal.set(2020, 2, 23);
		printResult(fromCal, toCal);
		
		fromCal.set(2020, 0, 23);
		toCal.set(2020, 2, 21);
		printResult(fromCal, toCal);
		
		fromCal.set(2021, 0, 22);
		toCal.set(2020, 2, 21);
		printResult(fromCal, toCal);
	
	}

}
