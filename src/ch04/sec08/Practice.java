package ch04.sec08;

public class Practice {

	public static void main(String[] args) {

		

		//138p q.3 정답
		int i;
		int sum1 = 0;
		for(i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum1 += i;
			}
		}
		System.out.println("3의 배수 총 합 : " + sum1);
		System.out.println(i); 
		//만약 i를 for문 밖에 int선언 안하고 for안에 선언하면 i를syso하는 것을 괄호밖에서 못 하고 for괄호 안에서 i를 syso해줘야함
		
		
		
		//q.6
		
		for(int a=1; a<=5; a++) {  //줄
			for(int j=1; j<=a; j++) { //행
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//3의 배수 이면서 5의 배수 
		int sum2 = 0;
		int b;
		for (b=1; b<=100; b++) {
			if (b % 3==0 && b % 5==0) {
				sum2 +=b;
			}
		}
		System.out.println("3과5의 공배수의 합 : " +sum2);
		
		
		// 1부터 100까지 짝수 
		
		for (int c=1; c<=100; c++) {
			if(c%2 != 0) {
				continue;
			}
			System.out.println(c);
		}
	
		
		
	}

}
