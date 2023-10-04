package ch08.sec02;

public class Television implements RemoteControl{
	//implements키워드는 해당 클래스가 인터페이스를 통해 사용할 수 있다는 표시이며
	//인터페이스의 추상 메소드를 재정의한 메소드가 있다는 뜻이다. 
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");  //turnOn()추상메소드 재정
	}

}
