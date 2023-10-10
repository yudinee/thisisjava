package ch09.sec04.exam01;

public class A {
	//로컬 클래스
	//생성자 또는 메소드 내부에 선언된 클래스
	
	
	//생성자
	A() {
		//로컬클래스 선언
		class B {}
		
		//로컬 객체 생성
		B b = new B();
	}
	
	//메소드
	void method() {
		class B {}
		
		B b = new B();
	}
		
	
}
