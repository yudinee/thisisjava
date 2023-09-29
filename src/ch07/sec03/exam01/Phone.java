package ch07.sec03.exam01;

public class Phone {
	//부모 생성자는 자식 생성자의 맨 첫 줄에 숨겨져있는 super()에 의해 호출된다.
	// super은 생략가능하고 부모클래스의 생성자는 원래 숨겨져 있다. 
	
	//필드선언
	public String model;
	public String color;
	
	//기본 생성자 선언
	public Phone () {
		System.out.println("Phone() 생성자 실행");  //기본 생성자 안에 있는 syso는 실행클래스에서 객체 생성만 하면 실행 됨 
	}

}
