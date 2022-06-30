package com.test.java;
import java.util.ArrayList;

class Fruit2 {public String toString() {return "Fruit";}}
class Apple2 extends Fruit2  {public String toString() {return "Apple";}}
class Grape2 extends Fruit2  {public String toString() {return "Grape";}}

class Juice {
	String name;
	
	Juice(String name) {this.name = name + "juice";}
	public String toString() {return name;}
}

class Juicer {
	static <T extends Fruit2> Juice makeJuice(FruitBox2<T> box) {
		String tmp = "";
		
		for(T f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}

class Ex12_4 {
	public static void main(String [] args) {
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	}

}

class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);}
	T get(int i) {return list.get(i);}
	ArrayList<T> getList() {return list;}
	int size() { return list.size();}
	public String toString() { return list.toString();}
}