package com.test.java;
class Data3 { int x;}

public class Ex6_8 {
	public static void main(String[] args) {
		Data3 d = new Data3(); //참조 변수 d를 선언
		d.x = 10; //d의 주소에 있는 x값에 10을 저장
		
		Data3 d2 = copy(d); // copy를 호출해서 명령을 수행한 다음 Data3 d2에 저장해라 즉 Data3 d2 = d.x(참조 변수 d의 x의 주소)
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x="+d2.x);
		d.x = 20;
		System.out.println(d.x); //d.x의 새로운 값인 20을 출력
		System.out.println(d2.x); //원래 d.x의 값인 10을 출력
		
		/*Data3 d2 = d;
		System.out.println("d.x ="+d.x);
		System.out.println("dx.x="+d2.x);
		d.x = 50;
		System.out.println("d.x ="+d.x);
		System.out.println("dx.x="+d2.x);*/
	}
	
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3(); //참조 변수 tmp를 선언
		
		tmp.x = d.x; //tmp에 있는 x의 주소값에 d에 있는 x의 주소값을 저장해라.
		
		return tmp; //복사한 d.x의 주소를 반환하고 더이상 필요 없는 tmp를 종료 
	//종료 직전 시점에서 d.x = d2.x = tmp.x = 10이다.
	}

}
