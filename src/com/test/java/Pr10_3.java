package com.test.java;
import java.util.*;
import java.text.*;

class Pr10_3 {
	static int paycheckCount(Calendar from, Calendar to) {
		if(from == null || to == null) //else if가 안되는 이유
			return 0;	
		//if(from == to && to == 21)
		if(from.equals(to) && from.get(Calendar.DAY_OF_MONTH)==21)
			return 1;
		
		int fromYear = from.get(Calendar.YEAR);
		int fromMon = from.get(Calendar.MONTH);
		int fromDay = from.get(Calendar.DAY_OF_MONTH);
		
		int toYear = to.get(Calendar.YEAR);
		int toMon = to.get(Calendar.MONTH);
		int toDay = to.get(Calendar.DAY_OF_MONTH);
		
//		int monDiff = ((toDate.get(Calendar.YEAR)*12) + toDate.get(Calendar.MONTH)  - (fromDate.get(Calendar.YEAR* 12 - (fromDate.get(Calendar.YEAR);
		int monDiff = (toYear * 12 + toMon) - (fromYear * 12 + fromMon);// 왜 그대로 안쓰고 다시 변환해서 하는거?
		if(monDiff < 0)
			return 0;
		if(fromDay <= 21 && toDay >= 21)
			monDiff++;
		if(fromDay > 21 && toDay > 21)
			monDiff--;
		
		return monDiff;
	}
	
	static void printResult(Calendar from, Calendar to) {
		Date fromDate = from.getTime();
		Date toDate = to.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + ":");
		
		System.out.println(paycheckCount(from,to));
	}
	
	public static void main(String [] args) {
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();
		
		fromCal.set(2020, 0, 1);
		toCal.set(2020, 0, 1);
		printResult(fromCal,toCal); 
		
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
