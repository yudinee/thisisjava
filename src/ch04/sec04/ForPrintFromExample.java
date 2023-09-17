package ch04.sec04;

public class ForPrintFromExample {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");   //println이 아닌 print이기때문에 줄 바꿈이 없으므로 " "을 통해 띄어쓰기를 해줌 
			                             
		}
	
		
		
		System.out.println("-----------------------");
		
		
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum = sum +i;               //실행 순서 책 125p보기 (1.i<=100, 2. sum = sum+i, 3. i++
			System.out.println(i);  //최종 i는 101
		}
		
		
		/*
		 * for안에 식을 두개씩 쓸 수 있음
		 * for (int i=0;, j=100; i<=50 && j>=50; i++,j--)
		 * 
		 * 
		 */
		
	}

}
