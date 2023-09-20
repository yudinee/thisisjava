package ch05.sec10;

public class Practice {

	public static void main(String[] args) {

		//198p 확인문제
		//q.7
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) 
				max = array[i];
		}
		System.out.println(max);
		
		
		
				//q.8 전체합과 평균을 구하라
				
				int[][] array3 = {
						{95, 86},
						{83,92,96},
						{78,83,93,87,88}
				};
				
				
				int sum = 0;
				double avg = 0.0;
				int cnt = 0;
				
				for (int i=0; i<array3.length; i++) {//줄
					for(int j=0; j<array3[i].length; j++) {
						sum += array3[i][j];
						cnt++;
					}
				}
				
				avg = (double)sum/cnt;
				
				System.out.println("sum : " + sum);
				System.out.println("avg : " + avg);
		
	}

}
