package com.test.java;
import java.util.*;

public class Pr10_4 {
	public static void main(String [] args) {
		Calendar date = Calendar.getInstance();
		Calendar today = Calendar.getInstance(); //값을 안바꾸면 오늘
		date.set(1993,4,9); //93.05.09
		long difference = (today.getTimeInMillis() - date.getTimeInMillis()/(1000*24*60*60));
		System.out.println(difference + "일"); // 값이 이상함
		
		
		
	}
}
