package ch08.sec04;

public class Audio implements Remotecontrol {
	
	//필드
	private int volume;
	
	//turnOn()추상메소드 오버라이딩
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
		if(volume>Remotecontrol.MAX_VOLUME) {
			this.volume = Remotecontrol.MAX_VOLUME;
		} else if(volume<Remotecontrol.MIN_VOLUME) {
			this.volume = Remotecontrol.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + volume);  //this.volume 아니고 volume이어도 됨 
	}

}
