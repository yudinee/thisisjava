package ch05.sec07;

public class MultiplemensionalExample {

	public static void main(String[] args) {

		int [][] scores = {
				{80,90,96},
				{76,88}
				
		};
		
		System.out.println("1차원 배열 길이(반의 수) :" + scores.length); //전체 줄 수
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수) :" + scores[0].length); //첫 줄  
		System.out.println("2차원 배열 길이(두 번째 반의 학생 수) :" + scores[1].length); //두번째 줄 
	
		
		//첫 번 반의 세 번째 학생
		System.out.println("scores[0][2]:" + scores[0][2]);  //[줄][칸]
		
		//두 번째 반의 두 번재 학생
		System.out.println("scores[1][1]:" + scores[1][1]);
		
		//첫 번째 반의 평균 점수
		int class1Sum = 0;
		for(int i =0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("첫번째 반의 평균 점수 :" + class1Avg);
		
		
		//두 번째 반의 평균 점수 
		int class2Sum = 0;
		for(int i =0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("두번째 반의 평균 점수 :" + class2Avg);
		
		//전체 학생의 평균 점수 구하기
		int totalStudent = 0;
		int totalSum = 0;
		for(int i=0; i<scores.length; i++) {   //몇줄  //반의 수만큼 반복
			totalStudent += scores[i].length;  
			System.out.println(totalStudent);//반의 학생 수 합산
			for(int k=0; k<scores[i].length; k++) { // 해당 반의 학생 수만큼 반복
				totalSum += scores[i][k];     //학생 점수 합산
			}
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균 점수 :" + totalAvg);
		
		
		
		
		
		
		
		
	}

}
