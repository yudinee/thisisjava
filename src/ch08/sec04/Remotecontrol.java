package ch08.sec04;

public interface Remotecontrol {

	//추상 메소드 
	//중괄호는 붙지않는 메소드
	//인터페이스의 추상메소드는 public abstract를 생략
	
	
	//상수필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드 
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
