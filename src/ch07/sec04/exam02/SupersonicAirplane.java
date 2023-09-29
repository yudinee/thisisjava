package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane {
	
	//상수 선언
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	//상태 필드 선언
	public int flyMode = NOMAL;
	
	//메소드 재정의
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행 합니다.");
		} else {
			//Aireplane의 fly()메소드 호출 
			super.fly();
		}
	}

}
