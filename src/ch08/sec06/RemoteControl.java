package ch08.sec06;

public interface RemoteControl {

	//정적 메소드
	//정적메소드는 객체가 없ㅇ도 인터페이스만으로 호출할 수 있다. 
	//public을 생략하더라도 자동으로 컴파일 과정에서 붙는 것이 차이점이다.
	
	//상수필드 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드 
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴드메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음해제합니다.");
		}
	}
	
	//정적메소드
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교체합니다.");
	}
}
