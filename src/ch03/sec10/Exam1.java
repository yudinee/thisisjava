package ch03.sec10;

public class Exam1 {

	public static void main(String[] args) {

		
		// 문제 1. page 107
				int x = 10;
				int y = 20;
				int z = (++x) + (y--);
				System.out.println("q1 : " + z);
				System.out.println("q1 : " + y);
				
				
				// 문제 2.
				int score = 85;
				String result = (!(score > 90) )? "가" : "나";  //괄호 가장 안쪽부터 계산, ?를 중심으로 그 앞이 조건
				                                               //앞이 true일때 값(가) 뒤가 false일때 값(나)
				System.out.println("q2 : "  + result);          // boolean이 아닌 string인 이유는 (가,나) 가 있기 때문
				
				
				// 문제 3.
				int pencils = 534;
				int students = 30;
				
				
				//학생 한 명이 가지는 연필 수 
				int pencilsPerStudent = (  pencils / students   );
				System.out.println("q3 : " + pencilsPerStudent);
				
				//남은 연필 수 
				int pencilsLeft = (   pencils % students  );
				System.out.println("q3 : " + pencilsLeft);
				
				
				
				// 문제 4.
				int value = 356;
				System.out.println(value - (value%300));
				
				
				// 문제 5.
				int lengthTop = 5;
				int lengthBottom = 10;
				int height = 7;
				double area = ( (lengthTop + lengthBottom) )* height /2;
				System.out.println("q5 : " + area);
				
				
				// 문제 6.
				int a = 10;
				int b = 5;
				
				System.out.println( ( a > 7 ) && ( b <= 5) );
				System.out.println( ( a%3 == 2 ) || ( b % 2 != 1) );  // 둘 다 나머지 1
				
				
	}

}
