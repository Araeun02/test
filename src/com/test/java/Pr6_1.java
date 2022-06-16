
package com.test.java;

class Student {
	String name; //홍길동
	int ban; //반
	int no; //번호
	int kor; //국어
	int eng; //영어
	int math; //수학
	//7 ?? 
	// 설명?
	
	Student() {}
	//public은 어떨때 쓰는거?
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		

	}
	
	String info() {
		
		String result = name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
		
		return result;
	}

	public int getTotal() {
		int total = kor + eng + math;
		return total;
	} 
	
	public float getAverage() {
		float avg = Math.round((getTotal() / 3f)*10) / 10f;
		return avg;
	}
		
		


}
//class info를 추가?

//class info {