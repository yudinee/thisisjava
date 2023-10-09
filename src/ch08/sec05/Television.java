package ch08.sec05;

public class Television implements RemoteControl{
	
	//필드
	private int volume;  //public이면 tv인지 audio인지 알 수 없음(내건 내 안에서만)
	
	//turnOn()추상메소드 오버라이딩
	@Override 
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	//turnOff()추상메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	//setVolume()추상메소드 오버라이딩
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume= RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;   //MAX, MIN사이에 있는 애들이면 그 값을 넣어 줌
		}
		
		System.out.println("현재 TV볼륨 : " + this.volume);
	}
}
