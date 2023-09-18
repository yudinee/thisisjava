package ch05.sec06;

public class ArrayLengthExample {

	public static void main(String[] args) {

		
		//배열변수.length;  배열의 길이

				int[] scores = {84, 90, 96};
				
				int sum = 0;
				for(int i=0; i<scores.length; i++) {   //scores.length; ->3 (84, 90, 96)
					sum += scores[i];
				}
				
				System.out.println("총합 : " +  sum);
				
				// 배열 항목의 평균 구하기
				double avg = (double) sum / scores.length; //scores.length; ->3  
				                                           //int를 double로 강제 형변환
				System.out.println("평균 : " + avg);
				
				
	}

}
