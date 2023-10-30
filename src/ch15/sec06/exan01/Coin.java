package ch15.sec06.exan01;

public class Coin {

	
private int value;
	
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	//get만 쓴 이유 : 실행 클래스에서 값 설정 후 값을 바꿀 일이 없어서 set 안 써도 됨 (선언클래스에서 생성자로 필드 값 넣어줬을 경우) 
	//만약 값을 바꾸려면 set을 만들어야 함 
}
