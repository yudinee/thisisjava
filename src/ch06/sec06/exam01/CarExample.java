package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {

		//car객체 생성
		Car car = new Car(); 
	//  Car(클래스 이름) car(변수)
	//  Car(타입의 제한x (int, string, double...))	
		
		
		//Car객체의 필드값 읽기
		System.out.println("모델명 : " + car.model);
		System.out.println("시동여부 : " + car.start);
		System.out.println("현재속도 : " + car.speed);
		
		
		
	
	}

}
