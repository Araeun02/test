package com.test.java;

class Ex13_7 implements Runnable {
	static boolean autoSave = false;
	
	public static void main(String [] args) {
		Thread t = new Thread(new Ex13_7());
		t.setDaemon(true);
		t.start();
		
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			System.out.println(i);
			
			if(i==5) autoSave = true; // 5에서 자동저장 메소드를 실행
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() { //run을 시행한적이 없는데 왜 실행? 독립적인 메소드가 아니라 main에 있는 메소드라 그런가?
		while(true) {
			try {
				Thread.sleep(3 * 1000); //3초마다 자동저장
			} catch(InterruptedException e) {}
			
			if(autoSave) autoSave();
		}
	}
	
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}
