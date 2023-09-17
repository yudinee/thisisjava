package ch04.sec04;

public class ForSumFromExample {

	public static void main(String[] args) {

		int sum = 0;
		int i;
		
		for(i =1; i<=100; i++) {
			sum += i;
			System.out.println(i);
		}
		System.out.println("1~" + (i-1) + "합 : " + sum);  // 최종i는  101 1~100을 표현하기 위해 i-1
	   // System.out.println(i);
	   //syso를 for문 괄호 안에다 쓰면 1~100까지 모두 다 나오고, 괄호 밖에다 쓰면 최종 i값이 나
		
		
	
	}

}
