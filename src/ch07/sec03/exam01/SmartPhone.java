package ch07.sec03.exam01;

public class SmartPhone extends Phone {
	
	public SmartPhone (String model, String color) {
		
		//자식 생성자 선언 
		super();    //부모클래스의 기본 생성자 호출(생략가능 (컴파일시 자동추가됨)
		this.model = model;
		this.color = color;
		System.out.println("SmartPhoe(String model, String color) 생성자 실행됨 ");
	}
	
	
	

}
