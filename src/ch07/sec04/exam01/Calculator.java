package ch07.sec04.exam01;
/* 메소드 오버라이딩은 상속된 메소드를 자식 클래스에서 재정의 하는 것을 말한다. 
 * 해당 부모 메소드는 숨겨지고 자식 메소드가 우선적으로 사용된다. 
 * 메소드 오버라이딩 규칙 
 * 	1. 부모 메소드의 선언부 (리턴타입, 메소드 이름, 매개변수)와 동일해야 한다. 
 * 	2. 접근 제한을 더 강하게 오버라이딩할 수 없다.(public -> private으로 변경 불가)
 * 	3. 새로운 예외(throws)할 수 없다. 
 */
public class Calculator {
	
	//메소드 선언
	public double areaCircle(double r) {
		System.out.println("Calcuator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}

	
}
