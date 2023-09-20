package ch05.sec10;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {

		//q.9
		
	Scanner scanner = new Scanner(System.in);
	int student = 0;
	int[] scores = null;
	boolean run = true;

	while (run) {
		System.out.println("--------------");
		System.out.println("1. 학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
		System.out.println("--------------");
		System.out.println("선택 > ");

		int select = scanner.nextInt();

		if (select == 1) {
			student = scanner.nextInt();
			scores = new int[student];
		} else if (select == 2) {
			for (int i = 0; i < scores.length; i++) {      // for (int i = 0; i < student; i++)로 해도 됨
				System.out.print("scores [" + i + "] >");
				scores[i] = scanner.nextInt();
			}
		} else if (select == 3) {
			for (int i = 0; i < scores.length; i++) {     // for (int i = 0; i < student; i++)로 해도 됨
				System.out.println("scores [" + i + "]" + scores[i]);
			}
		} else if (select == 4) {
			int max = 0;
			int sum = 0;
			for (int i = 0; i < scores.length; i++) {       // for (int i = 0; i < student; i++)로 해도 됨
				if (scores[i] > max) {
					max = scores[i];
				}
				sum += scores[i];
			}
			double avg = (double) sum / scores.length;
			System.out.println("최고 점수 : " + max);
			System.out.println("평균 점수 : " + avg);
		} else if (select == 5) {
			run = false;
		}

	}

	System.out.println("프로그램 종료 ");
}

}
