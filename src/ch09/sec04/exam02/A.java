package ch09.sec04.exam02;

public class A {

	// 메소드
	void useB() {
		// 로컬 클래스
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
				System.out.println("B-method1실행");
			}

			// 정적 메소드(자바 17부터 허용)
			/*static void method2() {
				System.out.println("B-method2실행");
			}*/

		} // B 끝남

		// 로컬 객체 생성
		B b = new B();

		// 로컬 객체의ㅏ 인스턴스 필드와 메소드 사용
		System.out.println(b.field1);
		b.method1();

		// 로컬클래스의 정적 필드와 메소드 사용 (자바17부터 허용)
		/*System.out.println(B.field2);
		B.method2(); */

	}

}
