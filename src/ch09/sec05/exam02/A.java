package ch09.sec05.exam02;

public class A {
	
	// 바깥 클래스 객체 접근
	// 바깥 클래스 이름에 this를 붙여주면 된다.

	// A인스턴스 필드
	String field = "A-field";

	// A인스터스 메소드
	void method() {
		System.out.println("A-method");
	}

	// 인스턴스 멤버 클래스
	class B {
		// B인스턴스 필드
		String field = "B-field";

		// B인스턴스 메소드
		void method() {
			System.out.println("B-method");
		}

		// B인스턴스 메소드
		void print() {
			// B객체의 필드와 메소드 사용
			System.out.println(this.field);
			this.method();

			// A객체의 필드와 메소드 사용
			System.out.println(A.this.field);
			A.this.method();
		}
	}

	// A의 인스턴스 메소드
	void useB() {
		B b = new B();
		b.print();

		// useB()안만들고 실행클래스에서 A.B b = a.new B(); 하고 b.print();해도 됨
	}
}
