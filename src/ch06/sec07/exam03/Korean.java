package ch06.sec07.exam03;

public class Korean {
	
	//필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자 선언 
	public Korean(String name, String ssn) {
		this.name = name;    //매개변수의 이름이 짧으면 코드 가독성이 좋지 않기때문에 가능하면 초기화시킬 필드명과 도일한 이름을 사용하는 것이 좋다. 
		this.ssn = ssn;       //필드의 색깔은 파란색, 매개변수의 색깔은 갈색이다.
	}

}
