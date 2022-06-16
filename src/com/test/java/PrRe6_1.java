package com.test.java;


class Student { //Student 클래스
	String name; // 이름 = String, 숫자는 = int ,long, double, float 등등
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student() {} // 생성자 생성
	public Student(String name, int ban, int no, int kor, int eng, int math) { // 매개변수
		this.name = name; //this.name과 같은 
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		string result = name + "," + ban + "," + no + "," + kor + "," + eng + "," + math  + "," + getTotal() + "," + getAverage();
		return result;
	}
	
	public int getTotal() {int total = this.kor + this.eng + this.math; 
		return total;
		}
	
	public float getAverage() {float average = Math.round((getTotal() /3f)*10)/10f;
		return average;
		}
	
}