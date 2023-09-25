package ch06.sec14;

public class Car {
	
	//필드 선언
	private int speed;
	private boolean stop;
	
	//speed 필드의 getter/setter선언 
	public int getSpeed() {
		return speed;     //이미 있는 speed를 불러온 것 
	}
	
	public void setSpeed(int speed) {
		if(speed <0) {      //잘못 된 값을 선정할 경우 (speed 음수) 
			this.speed = 0;    //speed를 0으로 설정해라 
			return;      //메소드를 끝내라 
		} else {         //음수가 아닐 경우 (speed>0) 
			this.speed = speed;
		}
	}
	
	
	//stop 필드의 getter/setter선언 
	public boolean isStop() {    //boolean타입의 get은 getStop이 아니라 isStop
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop==true) this.speed = 0;
	}
	

}
