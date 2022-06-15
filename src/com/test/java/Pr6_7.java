package com.test.java;

class Marine {
	int x = 0,y = 0;
	int hp = 60;
	static int weapon = 6;
	static int armor = 0;
	
	void weaponUp() { //공격력을 올리는 매서드
		weapon++;
	}
	
	void armourUp() { //방어력을 올리는 매서드
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}