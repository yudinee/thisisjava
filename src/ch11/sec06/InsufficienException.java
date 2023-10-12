package ch11.sec06;

public class InsufficienException extends Exception{//일반예외로 선언 
	//사용자 정의 예외
	//일반예외는 Exception의 자식클래스로 선언하고, 실행예외는 RuntimeException의 자식클래스로 선언한다.
	//사용자 정의 예외클래스에서는 기본생성자와 예외 메시지를 입력받는 생성자를 선언해준다.
	//사용자정이예외를 직접 코드에서 발생시키려면 throw키워드와 함께 예외객체를 제공하면 된다.
	
	
	public InsufficienException() {
	
	}
	
	public InsufficienException(String message) { //예외처리할 때 나올 문구 
		super(message);//super()을 꼭 써줘야 함 
	}

}
