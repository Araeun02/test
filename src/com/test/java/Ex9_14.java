package com.test.java;

public class Ex9_14 {
	public static void main(String [] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println("i==i2 ? "+(i==i2)); //i와 i2의 주소값이 동일한가?
		System.out.println("i.equals(i2) ? "+i.equals(i2)); //i1와 i2의 값이 동일한가?
		System.out.println("i.compareTo(i2)="+i.compareTo(i2));//i와 i2의 값을 비교하고 더 i가 더 크면 양수, i2가 더 크면 음수로 출력하라 둘의 값이 같다면 0
		System.out.println("i.toString()=" +i.toString()); 
		System.out.println("MAX_VALUE=" + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println("SIZE=" + Integer.SIZE+"bits");
		System.out.println("BYTES="+Integer.BYTES+"bytes");
		System.out.println("TYPE="+Integer.TYPE);
	}

}
