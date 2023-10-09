package ch08.sec05;

public class Audio implements RemoteControl{
	
	//필드 선언
	private int volume;
	
	//turnOn() 추상메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	//turnOff()추상메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	//setVolume()추상메소드 오버라이딩
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + volume);
	}
	//필드
	private int memoryVolume;
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = volume;
			System.out.println("무음처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음해제합니다");
			setVolume(memoryVolume);   //mute가 false일 경우, 원래 볼륨으로 복원하는 코드 
		}
	}
	
	
	
	
	
	
	
	
}
