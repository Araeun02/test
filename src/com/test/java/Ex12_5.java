package com.test.java;
enum Direction { EAST, SOUTH, WEST, NORTH} //enum(열거형) 열거형이름 {상수명1, 상수명2 ...}

class Ex12_5 {
	public static void main(String [] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST"); //정의하는 방법
		
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		System.out.println("d3=" + d3);
		
		System.out.println("d1==d2 ?" + (d1==d2)); //East = West false 
		System.out.println("d1==d3 ?" + (d1==d3)); //East = East true
		System.out.println("d1.equals(d3) ? " + d1.equals(d3)); //주소값을 비교?
		System.out.println("d1.compareTo(d3) ? " + d1.compareTo	(d3));
		System.out.println("d1.compareTo(d2) ? " + d1.compareTo	(d2)); //West - East
	
		switch(d1) {
		case EAST:
			System.out.println("The direction is EAST."); break;
		case SOUTH:
			System.out.println("The direction is SOUTH."); break;
		case WEST:
			System.out.println("The direction is WEST."); break;
		case NORTH:
			System.out.println("The direction is NORTH."); break;
		default:
			System.out.println("잘못된 방향"); break;
		}
		
		Direction[] dArr = Direction.values();
		
		for(Direction d : dArr) // for(Direction d : Direction.values())
			System.out.printf("%s=%d%n", d.name(), d.ordinal()); //d.ordinal()?
		
	}
}
