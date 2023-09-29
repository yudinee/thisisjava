package ch07.sec02;

public class Phone {
	
	//상속은 부모가 자식에게 물려주는 행위를 말한다. 부모 클래스의 필드와 메소드를 자식클래스에게 물려줄 수 있다. 
	//여러개의 부모클래스를 상속할 수 없다. 따라서 extends뒤에는 하나의 부모 클래스만 와야한다. 
	
	//필드 선언
	public String model;
	public String color;
	
	//메소드 선언
	public void bell () {
		System.out.println("벨이 울립니다. ");
	}
	
	public void sendVoice(String message) {
		System.out.println("자기: " + message);
	}

	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
