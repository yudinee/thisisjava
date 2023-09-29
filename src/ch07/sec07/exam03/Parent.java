package ch07.sec07.exam03;

public class Parent {
	//강제타입변환 
	//자식타입은 부모타입으로 자동변환 되지만
	//부모타입은 자식타입으로 자동 변환되지 않는다. 대신 다음과 같이 캐스팅 연산자로 강제 타입  변환을할 수 있다. 

	//필드 선언
	public String field1;
	
	//메소드 선언
	public void method1() {
		System.out.println("Parent-method1()");
	}
	
	//메소드 선언
	public void method2() {
		System.out.println("Parent-method2()");
	}
}
