package ch12.sec03.exam04;

public record Member(String id, String name, int age) {
	

	//레코드 선언
	//레코드 소스를 컴파인하면 변수의 타입과 이름을 이용해서 private final필드가 자동 생성되고
	// 생성자 및 getter 메소드가 자동으로 추가된다.
	//hashCode(), equals(), toString() 메소드를 재정의한 코드도 자동 추가된다.
	

}
