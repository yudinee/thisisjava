package ch06.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {

		//Car객체 생성 
		Car myCar = new Car();
		
		//Car객체의 필드값 읽기 
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed );
		System.out.println("현재속도 : " + myCar.speed);
		
		//Car객체의 필드값 변경 
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
		myCar.company = "삼성";
		System.out.println("수정된 제작회사 : " + myCar.company);
		

		int a = 9;
		System.out.println(a); //일반 변수도 선언 가능
		//실행 클래스는 중복선언 가능
		//Car(선언클래스)이외에도 예를들어 Tire라는 선언 클래스를 만들고 CarExample클래스 안에 Tire tire = new Tire();객체를 만들어서 
		//Tire(선언클래스)안에 필드를 선언하고 CarExample클래스 안에  Tire객체의 필드값 읽기를 해주면 됨
	}

}
