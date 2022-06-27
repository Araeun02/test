package com.test.java;
import java.util.*;
import java.text.*;

public class Pr10_1 {
	public static void main(String [] args) {
		Calendar date = Calendar.getInstance(); //기본값은 오늘 날짜
		date.set(2020,0,1);
		System.out.println(date.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		//for문으로 돌려야되나?
	}

}
