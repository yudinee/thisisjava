package ch08.sec05;

public interface RemoteControl {
	
	//디폴드 메소드
	//default키워드가 리턴타입 앞에 붙는다.
	//재정의(오버라이딩)하지 않아도 쓸 수 있다.
	
	//상수필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//default 인스턴스 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
			//추상 메소드 호출하면서 상수 필드 사용 
			setVolume(MIN_VOLUME);  //volume을 0 으로
		} else {
			System.out.println("무음해체합니다.");
		}
	}
}
