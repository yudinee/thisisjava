package ch07.sec10.exam01;
/*
 * 추상 클래스 
 * 	공통적인 필드나 메소드를 추출해서 선언한 클래스
 * 	실체 클래스의 부모역할을 한다. 따라서 실체 클래스는 추상클래스를 상속해서 공통적인 필드나 메소드를 물려받을 수 있다. 
 * 	추상클래스는 새로운 실채 클래스를 만들기 위한 부모 클래스로만 사용된다. 
 * 
 * 추상 클래스 선언
 * 	abstract키워드를 붙이면 추상클래스 선언이 된다. 
 * 	추상클래스는 new 연산자를 이용해 객체를 직접 만들지 못하고 상속을 통해 자식 클래스만 만들 수 있다. 
 * 	자식 객체가 생성될 때 super()로 추상클래스의 생성자가 호출되기 때문에 생성자도 반드시 있어야 한다. 
 * 	
 */
public abstract class Phone {
	
	//필드 선언
	String owner;
	
	//생성자 선언
	Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드 선언
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
}
