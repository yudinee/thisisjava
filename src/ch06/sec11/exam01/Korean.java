package ch06.sec11.exam01;

public class Korean {
	
	//인스턴스 필드와 정적필드는 값을 언제든지 변경할 수 있다. 그러나 경우에 따라서 값을 변경하는 것을 막고 
	//읽기만 허용해야할 때가 있다. 이때 final필드와 상수를 선언해서 사용해야 한다. 
	//final 필드는 초기값이 저장되면 이것이 최종적인 값이 되어서 프로그램 도중에 수정할 수 없다.
	
	
	
	//인스턴스 final 필드 선언 
	final String nation = "대한민국";
	final String ssn;
	
	//인스턴스 필드 선언 
	String name;
	
	//생성자 선언 
	Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

}
