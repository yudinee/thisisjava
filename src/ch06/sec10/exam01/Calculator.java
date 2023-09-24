package ch06.sec10.exam01;

public class Calculator {
	
	
	//정적멤버 (static)
	//필드와 메소드 모두 정적 멤버가 될 수 있다. 정적필드와 정적메소드로 선언하려면 static키워드를 추가하면 된다. 
	
	static double pi = 3.14159;
	
	static int plus (int x, int y) {
		return x + y;
	}

	static int minus (int x, int y) {
		return x - y;
	}
}
