package ch04.sec05;

public class WhilePrintFromExample {

	public static void main(String[] args) {

		
		int i = 1;
		while (i<=10) {      //while은 조건식이 true여야만 작동
			System.out.print(i + " ");
			i++;             //while은 실행문 마지막에 증감식 사용
		}

	
		
		System.out.println();
		
		
		
		int sum = 0;
		int j = 1;
		
		while(j<=100) {
			sum += j;
			j++;
		}
		System.out.println("1~" + (j-1) + "합 : " + sum);
		
		
		
	}

}
