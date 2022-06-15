package com.test.java;

class Ex6_14 {
	static {
		System.out.println("static { }"); //클래스 초기화 블럭 (1)
	}
	
	{System.out.println("{ }");} // 인스턴스 초기화 블럭 //(3),(5)

	public Ex6_14() {System.out.println("생성자");}
	
	public static void main(String[] args) { //(2)
		System.out.println("Ex6_14 bt = new ex6_14(); ");
		Ex6_14 bt = new Ex6_14(); //(4)
		
		System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
		Ex6_14 bt2 = new Ex6_14(); //(6)
	}
	
}

// 시스템 구동 순서 run을 누르면 static이 가장 먼저 수행됨 그다음 main 그 후로 초기화 그 이후로는 순서대로