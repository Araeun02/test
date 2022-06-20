package com.test.java;

class MyTv10 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void isPowerOn() {isPowerOn = !isPowerOn;}
	public void getVolume() {}
	public void getChannel() {}
}

public class Pr7_4 {
	public static void main(String [] args) {
		MyTv10 t = new MyTv10();
		t.getChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.getVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}

}
