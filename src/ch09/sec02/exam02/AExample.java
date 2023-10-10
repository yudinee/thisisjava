package ch09.sec02.exam02;

public class AExample {

	public static void main(String[] args) {

		//A객체 생성 
		A a = new A();
		
		//A인스턴스 메소드 호출 
		a.useB();
		
		System.out.println();
		
		A.B b = a.new B();         // 선언클래스에서 B 객체를 만들지 않았다면 실행클래스에서 B 객체를 만들어서 쓸 수 있음
		b.method1();
		System.out.println(b.field1);   //(선언클래스에 B객체가 만들어져 있더라도 실행클래스에서 B객체를 만들어서 메소드를 각각 호출할 수 있음
	}

}
