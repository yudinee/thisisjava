package ch07.sec04.exam02;

public class Airplane {
	//오버라이딩을 하면 부모 메소드는 숨겨지고 자식 메소드만 사용된다. 
	//super.()을 사용하면 숨겨진 부모 메소드를 호출할 수 있다. 
	
	//메소드 선언
	public void land() {
		System.out.println("착륙합니다.");
	}
	
	public void fly() {
		System.out.println("일반 비행합니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}

}
