package com.test.java;

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100; //final int가 뭐가 다른거였지?
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;
	
	void  turnOnOff() {
		isPowerOn = !isPowerOn;
		/*if(isPowerOn == true) {
			isPowerOn = false;
		} else if(isPowerOn == false) {
			isPowerOn = true;
		}*/
		// isPowerOn의 값이면 true면 false로, false면 true로 바꿈
	}
	
	void volumeUp() {
		if(volume<MAX_VOLUME) {
			++volume; //++volume인지 volume++인지 상관이 있나?
		}
		// volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
	}
	
	void volumeDown() {
		if(volume>MIN_VOLUME) {
			--volume;
		}
		// volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
	}
	
	void channelUp() {
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			++channel;
		}
		//channel의 값을 1 증가시킨다.
		//channel이 MAX_CHANNEL이라면 MIN_CHANNEL로 바꾼다.
	}
	
	void channelDown() {
		if(channel ==  MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		} else {
			--channel;
		}
		//channel의 값을 1 감소시킨다.
		//channel이 MIN_CHANNEL이라면 MAX_CHANNEL로 바꾼다.
	}
}

public class Pr6_19 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
	}

}
