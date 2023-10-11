package ch11.sec03.exam01;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		// 다중 catch를 사용하면 발생하는 예외에 따라 코드를 다르게 작성할 수 있다.
		
		

		String[] array = { "100", "1oo" }; // 문자타입

		for (int i = 0; i < array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]); // Integer.parseInt -> 숫자를 문자로 바꿔라
				System.out.println("array[" + i + "]: " + value);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열인덱스가 초과됨 : " + e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음 : " + e.getMessage());
			}
		}
	}

}
