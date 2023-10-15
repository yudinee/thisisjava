package ch12.sec06;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {

		// 선택번호
		int[] selectNumber = new int[6]; // 선택번호 6개가 저장될 배열 생성
		Random random = new Random(); // 선택번호를 얻기위한 Random 객체 생성 //()안에 숫자는 아무거나 (바꿔주지 않으면 결과값도 안바뀜) (숫자를 아예 비우면 계속
										// 랜덤)
		System.out.print("선택번호: ");
		for (int i = 0; i < 6; i++) { // 번호 6개를 얻어 배열에 저장
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();

		// 당첨번호
		int[] winningNumber = new int[6]; // 당첨번호 6개가 저장될 배열 생성
		random = new Random(); // 당첨번호를 얻기 위한 Random객체 생성 //()안에 숫자는 아무거나 (바꿔주지 않으면 결과값도 안바뀜) (숫자를 아예 비우면 계속
								// 랜덤)
		System.out.print("당첨번호 : ");
		for (int i = 0; i < 6; i++) { // 당첨번호 6개를 얻어 배열에 저장
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}

		System.out.println();

		// 당첨여부
		Arrays.sort(selectNumber); // 비교하기 전에 배열 항목을 정렬시킴
		Arrays.sort(winningNumber); // 당첨번호가 같은지 확인하려고 정렬
		boolean result = Arrays.equals(selectNumber, winningNumber); // 배열항목 비교하기
		System.out.print("당첨여부: ");
		if (result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}

}
