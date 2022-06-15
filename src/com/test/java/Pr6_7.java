package com.test.java;

class Marine {
	int x = 0,y = 0;
	int hp = 60;
	int weapon = 6;
	int armor = 0;
	
	void weaponUp() {
		weapon++;
	}
	
	void armourUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}