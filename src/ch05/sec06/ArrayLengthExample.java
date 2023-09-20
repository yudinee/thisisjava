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
				//double이 int보다 큰데 (double)강제형변환을 한 이유는 강제형변환을 하지 않으면 나눴을 때 값이 몫까지 3.3333...이라고치면
				//나머지 없이 3.0으로 몫만 나옴 강제형변환을 해주면 나머지까지 모두 나옴 
				//나누기를 해주는 경우에만 (double)로 강제형변환을 해주면 됨!!
				
				
				System.out.println("평균 : " + avg);
				
				
	}

}
