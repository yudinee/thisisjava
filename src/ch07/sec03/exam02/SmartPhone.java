package ch07.sec03.exam02;

public class SmartPhone extends Phone {
	
	//자식 생성자 선언 
	public SmartPhone(String model, String color) {
		super(model, color);    //반드시 작성해야 함 // 부모 클래스에 있는 걸 자식에 가져올 때 super라는 이름으로 가져옴 
		System.out.println("SmartPhone(String modle, String color) 생성자 실행됨 ");
	}

}
