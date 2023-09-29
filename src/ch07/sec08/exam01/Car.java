package ch07.sec08.exam01;

public class Car {
	//필드 선언
	public Tire tire;  //Tire타입(Tire클래스), tire는 변수
	
	//메소드 선언
	public void run() {
		//tire필드에 대입된 객체의 roll() 메소드 호출
		tire.roll();
	}

}
