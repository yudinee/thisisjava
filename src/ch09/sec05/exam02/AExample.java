package ch09.sec05.exam02;

public class AExample {

	public static void main(String[] args) {
		//A객체 생성
		A a = new A();
		
		//A메소드 호출 
		a.useB();
		
		System.out.println();
		
		//실행 클래스에서 B객체 만들 수도 있음 
		A.B b = a.new B();
		
		b.print();
	}
}
