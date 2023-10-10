package ch09.sec02.exam02;

public class A {

	// 인스턴스 멤버 클래스
	class B {
		// 인스턴스 필드
		int field1 = 1;

		// 정적필드(자바 17부터 허용)
		//static int field2 = 2;

		// 생성자
		B() {
			System.out.println("B-생성자 실행");
		}

		// 인스턴스 메소드
		void method1() {
			System.out.println("B-method1 실행");
		}

		/* 정적 메소드 (자바 17부터 허용)
		//static void method2() {
			System.out.println("B-method2 실행"); 
		}*/
	} // B끝남

	// 인스턴스 메소드
	void useB() {
		// B객체 생성 및 인스턴스 필드 및 메소드 사용
		B b = new B(); // static class(400p)와 다른점 -> B객체를 생성해 줌(B 클래스 앞에 static이 없어서)
		System.out.println(b.field1);
		b.method1();

		// B클래스의 정적 필드 및 메소드 사용 (자바 17부터 허용)
		/*System.out.println(B.field2);
		B.method2();*/

	}

}
