package ch05.sec07;

public class MultidimensionByNewExample {

	public static void main(String[] args) {

		// new int[][] 쓰는 경우, 각 배열의 수 저장
		
			//각 반의 학생 수가 3명으로 동일할 경우 
			int[][] mathScores = new int [2][3];// 2반3명
			
			for(int i =0; i<mathScores.length; i++) { //반의 수만큼 반복  // 몇 줄이냐
				for(int k=0; k<mathScores[i].length; k++) { //해당 반의 학생 후 만큼 반복
					
					System.out.println("mathScores[" + i + "][" + k + "]:" + mathScores[i][k]);
				}
			}
			
			System.out.println();
			//배열 항목 값 변경
			mathScores[0][0] = 80;
			mathScores[0][1] = 83;
			mathScores[0][2] = 85;
			mathScores[1][0] = 86;
			mathScores[1][1] = 90;
			mathScores[1][2] = 92;

			//전체 학생의 수학 평균 구하기
			int totalStudent = 0;
			int totalMathSum = 0;
			for(int i=0; i<mathScores.length; i++) { //반의 수만큼 반복
				totalStudent += mathScores[i].length;  //반의 학생 수 합산
				for(int k=0; k<mathScores[i].length; k++) { //해당 반의 학생 수만큼 반복
					
					totalMathSum += mathScores[i][k];      //학생 점수 합산
				}
			}
			
			double totalMathAvg = (double) totalMathSum / totalStudent;
			System.out.println("전체 학생의 수학 평균 점수 :" + totalMathAvg);
			System.out.println();
			
			
			//각 반의 학생 수가 다른 경우 점수 저장
			int [][] englishScores = new int [2][]; // 2반, 학생 수 다름
			englishScores[0] = new int[2]; // 2명
			englishScores[1] = new int[3]; //3명
			//배열 항목 초기값 출력
			for (int i=0; i< englishScores.length; i++) {
				for(int k=0; k<englishScores[i].length; k++) {
					System.out.println("englishScores[" + i + "][" + k + "]: " + englishScores[i][k]);
				}
			}
			System.out.println();
			//배열 항복 값 변경
			englishScores[0][0] = 90;
			englishScores[0][1] = 91;
			englishScores[1][0] = 92;
			englishScores[1][1] = 93;
			englishScores[1][2] = 94;
			
			//전체 학생의 영어 평균 구하기
			totalStudent = 0;
			int totalEnglishSum = 0;
			for(int i=0; i<englishScores.length; i++) {
				totalStudent += englishScores[i].length;
				for(int k=0; k<englishScores[i].length; k++) {
					
					totalEnglishSum += englishScores[i][k];
				}
			}
			
			double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
			System.out.println("전체 학생의 영어 평균 점수 :" + totalEnglishAvg);
	}

}
