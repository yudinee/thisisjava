package ch09.sec02.exam01;

public class AExample {

	public static void main(String[] args) {

		//A객체 생성
		A a = new A();
		
		//B객체 생성 
		A.B b = a.new B(); //B클래스를 단독 객체로 생성 
	}

}
