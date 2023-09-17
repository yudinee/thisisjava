package ch04.sec02;
/*
 * if (조건식) {
 * 		실행문;
 * 		실행문;
 * 		...
 * }
 * 
 * 컨트롤 + 쉬프트 + f 본문 드래그 후 누르면 줄 정리 해줌
 */
public class IfExample {

	public static void main(String[] args) {

		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");

		}

		if (score < 90) {
			System.out.println("점수가 90보다 작습니다.");
		System.out.println("등급은 B입니다. "); 
		}  // if문에 모두 {} 괄호가 있으면 그 중 true인 것만 출력
		
		
		if (score < 90)
			System.out.println("점수가 90보다 작습니다.");  // if문인데 false이기때문에 출력 안됨
		System.out.println("등급은 B입니다. "); // if문에 {} 괄호가 없으면 if문 밑에 있는 실행문 하나만 if소속
										    // 따라서 이 문장은 if문과 상관 없으므로 출력
		
		
	
	}

}
