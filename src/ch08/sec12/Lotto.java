package ch08.sec12;

public class Lotto {

	public static void main(String[] args) {

		int LottoNumber[] = new int[6];

		// for문 돌려서 1~45번의 랜덤숫자 추출
		for (int i = 0; i < LottoNumber.length; i++) {

			LottoNumber[i] = ((int) (Math.random() * 45) + 1);
			System.out.println("LottoNumber --> " + LottoNumber[i]);

			// 앞의 숫자와 뒤의 숫자가 같으면 중복된 숫자를 알려주고 다시 한 번 돈다.

			for (int j = 0; j < i; j++) {
				if (LottoNumber[i] == LottoNumber[j]) {
					System.out.println("중복된 숫자가 있어요 --> " + LottoNumber[i]);
					// 중복건수를 처리하기위해 반복분 i 번째를 다시 내린다.
					i--;
				}
			}
		}

		// 위에서 정리된 LottoNumber 배열을 다시 마지막으로 정리
		for (int i = 0; i < LottoNumber.length; i++) {
			System.out.println("확정번호 ----> " + LottoNumber[i]);
		}

	}

}
