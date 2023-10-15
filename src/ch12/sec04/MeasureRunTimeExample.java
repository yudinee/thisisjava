package ch12.sec04;

public class MeasureRunTimeExample {

	public static void main(String[] args) {
		// System클래스의 currentTimeMillis()메소드와 nanoTime()메소드는 1970년부터 현재까지 진행된 시간을 리턴한다.
		long time1 = System.nanoTime();
		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += 1;
		}

		long time2 = System.nanoTime();

		System.out.println("1~1000000까지의 합: " + sum);
		System.out.println("계산에 " + (time2 - time1) + "나노초가 소요되었습니다.");
	}

}
