package ch05.sec06;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {

		String[] season = { "Spring", "summer", "Fall", "Winter" };

		System.out.println("season[0] :" + season[0]);
		System.out.println("season[1] :" + season[1]);
		System.out.println("season[2] :" + season[2]);
		System.out.println("season[3] :" + season[3]);

		System.out.println();
		// 1번 항목의 값 변경
		season[1] = "여름";
		System.out.println("season[1] : " + season[1]);
		System.out.println();

		int[] scores = { 83, 90, 87 };

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3; // int를 double로 강제 형변환
		System.out.println("평균 : " + avg);

		
	}

}
