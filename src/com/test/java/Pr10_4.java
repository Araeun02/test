package com.test.java;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Pr10_4 {
	public static void main(String [] args) {
		Calendar date = Calendar.getInstance();
		Calendar today = Calendar.getInstance(); //값을 안바꾸면 오늘
		date.set(1993,4,9); //93.05.09
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("birth day =" + df.format(new Date(date.getTimeInMillis())));
		System.out.println("today =" + df.format(new Date(today.getTimeInMillis())));
		long difference = (today.getTimeInMillis() - date.getTimeInMillis())/1000;
		System.out.println(difference/(24*60*60) + "일"); // 값이 이상함
	}
}
