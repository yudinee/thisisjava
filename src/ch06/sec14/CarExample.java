package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {

		//객체 생성 
		Car myCar = new Car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		System.out.println("현재속도 : " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재속도 : " + myCar.getSpeed());
		
		//멈춤
		if(!myCar.isStop()) {   //선언문에서 stop값은 false (Car클래스 7번줄) !는 false가 아니다 라는 뜻 -> 밑에 true값 실행  
			myCar.setStop(true);    //true일때 speed 0 (car클래스 30번줄 )
		}
		System.out.println("현재속도 : " + myCar.getSpeed());
		
	}

}
