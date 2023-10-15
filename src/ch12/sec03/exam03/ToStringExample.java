package ch12.sec03.exam03;

public class ToStringExample {

	public static void main(String[] args) {

		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");

		String strObj = myPhone.toString(); // toString() 메소드 호출
		System.out.println(strObj); // 꼭 이렇게 안가져와도 되고 밑에처럼 syso(myPhone)으로만 가져와도 됨

		System.out.println(myPhone); // toString()메소드 호출
										// myPhone엔 객체가 들어있어서 toString() 오버라이딩 하지 않으면 16진수로 표현 됨
										// 선언클래스에서 private써서 myPhone.company 이렇게 String 필드 사용 불가
	}

}
