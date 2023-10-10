package ch09.sec04.exam03;

public class A {

	// 로컬변수(생성자 또는 메소드의 매개변수 또는 내부에서 선언된 변수)를 로컬클래스에서 사용할 경우
	// 로컬변수는 final특성을 갖게 되므로 값을 읽을 수만 있고 수정할 수 없게 된다.

	// 메소드
	public void method1(int arg) { // final int arg
		// 로컬변수
		int var = 1;

		// 로컬 클래스
		class B {
			// 메소드
			void method2() {
				// 로컬변수 읽기
				System.out.println("arg : " + arg);
				System.out.println("var : " + var);

				// 로컬변수 수정
				// arg = 2;
				// var = 2;
			}
		}

		// 로컬객체 생성

		B b = new B();
		// 로컬객체 메소드 호출
		b.method2();

		// 로컬변수 수정
		// arg = 3;
		// var = 3;
	}

}
