package ch07.sec10.exam02;

public abstract class Animal {
	
	//추상 메소드와 재정의
	//추상클래스는 abstract 키워드가 붙고 메소드 실행 내용인 중괄호{}가 없다. 
	//추상메소드는 자식 클래스에서 반드시 재정의(오버라이딩)해서 실행 내용을 채워야 한다. 
	
	
	//메소드 선언
	public void breathe() {
		System.out.println("숨을 쉽니다. ");
	}
	
	//추상 메소드 선언
	public abstract void sound();

}
