package ch14.sec06.exam01;

public class User1Thread extends Thread{

private Calculator calculator;
	
	public User1Thread() {
		setName("User1Thread");   //스레드 이름 변경
	}
	
	public void setCalculator(Calculator calculator) {   //외부에서 공유 객체인 Calculator를 받아 필드에 저장
		this.calculator = calculator;
	}

	@Override
	public void run() {
		calculator.setMemory1(100);   //동기화 메소드 호출
	}
}
