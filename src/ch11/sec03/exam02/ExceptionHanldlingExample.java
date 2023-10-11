package ch11.sec03.exam02;

public class ExceptionHanldlingExample {

	public static void main(String[] args) {

		// 상속관계에 있을 때 하위클래스의 catch블록을 먼저 작성하고 상위클래스의 catch블록을 나중에 작성해야 한다.
		
		

		String[] array = { "100", "1oo" };
		for (int i = 0; i < array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]:" + value);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨 : " + e.getMessage());
			} catch (Exception e) { // 상위예외클래스는 아래쪽에 작성(Exception이 가장 상위)
				System.out.println("실행에 문제 있습니다.");
			}
		}

	}

}
