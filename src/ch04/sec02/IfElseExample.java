package ch04.sec02;
/*
 * if (조건식) {
 * 		(조건식이 true면 출력)
 *  } else {
 *  	(조건식이 false면 출력)	
 *  }
 * 
 */
public class IfElseExample {
	public static void main(String[] args) {
		
		

		int score = 85;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");

		} else {
			System.out.println("점수가 90보다 작습니다.");
		    System.out.println("등급은 B입니다. "); 
		}
		
		
	}

}
