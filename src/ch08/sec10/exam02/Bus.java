package ch08.sec10.exam02;

public class Bus implements Vehicle{

	//추상메소드 오버라이딩
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	//추가메소드
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
