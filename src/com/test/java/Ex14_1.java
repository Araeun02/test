package com.test.java;

@FunctionalInterface
interface MyFunction {
	void run();
}

class Ex14_1 {
	static void execute(MyFunction f) {
		f.run();
	}
	
	static MyFunction getMyFunction() {
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String [] args) {
		MyFunction f1 = () -> System.out.println("f1.run()");//
		MyFunction f2 = new MyFunction() {
			public void run() {//Ex.13_7에서는 start로 run을 실행했는데 여기에서도 비슷한거? execute?
				System.out.println("f2.run()");
			}
		};
		
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute( ()-> System.out.println("run()") );
	}
}
