package com.test.java;
import java.util.*;
import java.text.*;

class Pr10_2 {
	public static void main(String [] args) {
		String pattern = "yyyy/MM/dd"; //입력받을 패턴
		DateFormat df = new SimpleDateFormat(pattern); //pattern의 형태로 DateFormat df를 형성
		Scanner s = new Scanner(System.in); //Scanner s 생성
		
		Date inDate = null; //inDate에 빈값을 주어 채을수 있도록
		
		System.out.println("날짜를 " + pattern + "의 형태로 입력하세요.(2017/05/11)"); //입력받을 형태를 안내
		
		while(s.hasNextLine()) { // 
			try {
				inDate = df.parse(s.nextLine());//Scanner s에서 받은 값을 df에 넣을수 있도록 변환
				break;
			} catch(Exception e) { //잘못 입력했다면 다시 입력을 요구
				System.out.println("날짜를 " + pattern + "의 형태로 입력하세요.(2017/05/11");
			}
		}
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		String week = DAY_OF_WEEK[cal.get(Calendar.DAY_OF_WEEK)];
		System.out.println("입력하신 날짜는 " + week + "요일");
	}

}
//직접