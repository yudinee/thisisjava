package ch05.sec10;
/*
 * for ( 2.타입 변수 : 1.배열 ) {
 * 
 * 			3.실행문;
 * 	}
 * 
 * for문이 실행되면 1.배열에서 가져올 항목이 있을 경우 2.변수에 항목을 저장하고, 3.실행문을 실행한다. 
 * 다시 반복해서 1.배열에서 가져올 다음 항목이 존재하면 2.-> 3.-> 1. 로 진행하고
 * 가져올 항목이 없으면 for문을 종료한다. 
 * 
 */
public class AdvancedForExample {

	public static void main(String[] args) {


		//향상된 for문
		
		//배열 벼수 선언과 배열 생성
		int[] scores = {95, 71, 84, 93, 87};
		//배열 항목 전체 합 구하기
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 :" + sum);
		
		//배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
		
	}

}
