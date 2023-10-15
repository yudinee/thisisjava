package ch12.sec04;

public class ErrExample {

	public static void main(String[] args) {
		
		try {
			int value = Integer.parseInt("1oo");
		} catch (NumberFormatException e) {
			System.err.println("[에러내용]");
			System.err.println(e.getMessage());
			System.out.println("에러내용");
			System.out.println(e.getMessage());
		}
	}

}
