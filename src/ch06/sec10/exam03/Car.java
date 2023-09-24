package ch06.sec10.exam03;

public class Car {
	
	//정적 메소드와 정적블록은 객체가 없어도 실행된다는 특징때문에 인스턴스필드나 인스턴스 메소드를 사용할 수 없다. 
	//객체 자신의 참조인 this도 사용할 수 없다. 
	//정적 메소드와 정적블록에서 인스턴스 멤버를 사용하고 싶다면 객체를 먼저 생성하고 참조 변수로 접근해야 한다. 
	
	//인스턴스 필드 선언
	int speed;
	
	//인스턴스 메소드 선언
	void run () {
		System.out.println(speed + "으로 달립니다.");
		
	}
	
	static void stimulate () {       //static메소드 
		//객체 생성 
		Car myCar = new Car();        //static에서 사용하기 위해 생성자 선언
		//인스턴스 멤버 사용 
		myCar.speed = 200;
		myCar.run();
		
	}
	
	public static void main(String[] args) {     //클래스 따로 만드는 것과 동일
		//정적 메소드 호출 
		stimulate();             //위에 myCar.run();이 들어옴
		
		//객체 생성 
		Car myCar = new Car ();
		//인스턴스 멤버 사용 
		myCar.speed = 60;
		myCar.run();
	}

}
