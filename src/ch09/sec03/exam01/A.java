package ch09.sec03.exam01;

public class A {

	// 정적 멤버 클래스
	// static키워드와 함께 A클래스의 멤버로 선언된 B클래스를 말한다.

	
	// 인스턴스 멤버 클래스
	static class B {
	}

	// 인스턴스 필드 값으로 B객체 대입
	B field1 = new B();

	// 정적 필드 값으로 B객체 대입
	static B field2 = new B();

	// 생성자
	A() {
		B b = new B();
	}

	// 인스턴스 메소드
	void method1() { // 객체를 만들어서 호출
		B b = new B();
	}

	// 정적 메소드
	static void method2() { // 객체 없이도 호출가능
		B b = new B();
	}

}
