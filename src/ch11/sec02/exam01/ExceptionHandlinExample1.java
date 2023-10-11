package ch11.sec02.exam01;
/*
 * 예외
 * 	try블록에서 작성한 코드가 예외없이 정상실행되면 catch블록은 실행되지 않고 finally블록이 실행된다.
 * 	그러나 try블록에서 예외가 발생하면 catch블록이 실행되고 연이어 finally블록이 실행된다.
 * 	
 * 	예외발생여부와 상관없이 finally블록은 항상실행된다. 
 * 	finally블록은 생략 가능
 */
public class ExceptionHandlinExample1 {
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수 : " + result);
	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisisJava");
		printLength(null); // 오류
		System.out.println("프로그램 종료"); // 실행 중 오류가 발생하면 프로그램 즉시 종료 (프로그램종료는 실행안됨)
	}

}
