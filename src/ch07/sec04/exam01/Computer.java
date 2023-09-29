package ch07.sec04.exam01;

public class Computer extends Calculator {
	
	//메소드 오버라이딩 
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의  areaCircle() 실행");  //선언문은 같은데 실행문이 달라짐 
		return Math.PI * r * r;
	}

}
