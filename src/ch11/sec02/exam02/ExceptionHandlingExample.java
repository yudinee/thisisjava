package ch11.sec02.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		//주어진 클래스를 찾는 코드

		try {
			Class.forName("java.lang.String"); // String은 클래스
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) { // Exception만 써도 됨
			e.printStackTrace();
		}
		System.out.println();

		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
