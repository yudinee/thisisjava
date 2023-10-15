package ch12.sec03.exam03;

public class SmartPhone {
	
	// toStrig
	// Object의 toString메소드는 객체의 문자 정보를 리턴한다.
	// 기본적으로 Object의 toString()메소드는 '클래스명@16진수해시코드'로 구성된 문자열을 리턴한다.

	// toString은 객체를 가져와서 객체를 출력할 때 사용

	private String company; // private -> 생성자를 통해 값을 넣어줘서 실행클래스에서 사용
	private String os;

	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override // Object의 toSting() 메소드를 재정의해서 제조사와 운영체제가 결합된 문자열을 리턴하도록 함
	public String toString() { // toString오버라이딩 한 것 주석처리하고 실행해 보기
		return company + ", " + os;
	}
}
