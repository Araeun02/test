package com.test.java;

class MyTv10 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int previouschannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void isPowerOn() {isPowerOn = !isPowerOn;}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		if(MAX_CHANNEL < channel || channel< MIN_CHANNEL )
			return;
		previouschannel = this.channel;
		this.channel = channel;
	} 
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(MAX_VOLUME < volume || MIN_VOLUME > volume)
			return;
		
		this.volume = volume;
	}
	public void gotoPrevChannel() {
		setChannel(previouschannel);
		
		/*int tmp = previouschannel;
		previouschannel = this.channel;
		this.channel = tmp;*/
		
		//previouschannel =  channel; //이전 return channel을 받아오면 되는거 아닌가?
	}
}

public class Pr7_4 {
	public static void main(String [] args) {
		MyTv10 t = new MyTv10();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}

}
