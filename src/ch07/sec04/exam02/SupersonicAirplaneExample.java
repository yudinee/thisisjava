package ch07.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly(); //super.()을 통해 숨겨진 부모 메소드 실행 
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NOMAL;
		sa.fly();
		sa.land();
	}

}
