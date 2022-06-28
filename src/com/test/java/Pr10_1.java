package com.test.java;
import java.util.*;
import java.text.*;

public class Pr10_1 {
	public static void main(String [] args) {
		Calendar cal = Calendar.getInstance(); //기본값은 오늘 날짜
		cal.set(2020,0,1);//2020/01/01
		for(int i = 0; i < 12; i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK);
			int secondSunday = (weekday==1) ? 8 : 16 - weekday; 
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime();
			System.out.println(new SimpleDateFormat("yyyy-MM-dd는 F번째 E요일입니다.").format(d));
			
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH,1);
		}
		//for문으로 돌려야되나?
	}

}
