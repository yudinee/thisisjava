package ch07.sec07.exam02;

public class Parent {
	// 부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근이 가능하다.
	// 자식 클래스에서 오버라이딩된 메소드가 있다면 부모 메소드 대신 오버라이딩된 메소드가 호출된다.

	
	// 메소드 선언
	public void method1() {
		System.out.println("Parent-method1()");
	}
	
	//메소드 선언
	public void method2() {
		System.out.println("Parent-method2()");
	}

}
