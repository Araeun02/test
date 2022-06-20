package com.test.java;

class MyTv10 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void power() {isPowerOn = !isPowerOn;}
	

public class Pr7_4 {
	public static void main(String [] args) {
		MyTv10 t = new MyTv10();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}

}
