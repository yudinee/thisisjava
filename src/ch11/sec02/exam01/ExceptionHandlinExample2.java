package ch11.sec02.exam01;


public class ExceptionHandlinExample2 {
	// catch블록에서 예외처리

	public static void printLength(String data) {
		try {
			int result = data.length(); // data가 null일경우 NullPointException발생
			System.out.println("문자 수  : " + result);
		} catch (NullPointerException e) { // Exception만 적어도 됨
			System.out.println(e.getMessage()); // ①
			// System.out.println(e.toString()); //②
			// e.printStackTrace(); //③
			// 예외 정보 얻는 3가지 방법
		} finally { // finally는 생략가능
			System.out.println("[마무리 실행]\n");

		}
	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisisJava");
		printLength(null);
		printLength("성유진");
		System.out.println("[프로그램 종료]");
	}
}
