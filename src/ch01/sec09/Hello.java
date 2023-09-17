package ch01.sec09;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println("Hello java 안녕하세요 ");
		System.out.print("우리 열심히 6개월을 함께 가요.");
		System.out.println( 777); // 문자는 " "(따음표 표시), 숫자는 따음표 표시 필요없음 (숫자를 문자로 표현할 때는 " " 따음표표시 필요)
		
		
		int x; // int는 정수만 들어감! 실수, 문자는 안들어감
		x = 1; // '='는 같다라는 의미가 아니라(x는1이 아님) 오른쪽에 있는 값이 왼쪽으로 들어가는 것, 즉 x안에 1이 들어간 것
		System.out.println(x);
		/*x = 3;
		System.out.println(x);
		System.out.println("x"); //" " 안에 있는 문자는 문자 그대로 출력 */
		
		int y = 5;
		
		int result = x + y;
		System.out.println(result);
		
		System.out.println("x와y를 더한 값은 " + result + " 입니다."); //문자와 변수값을 이어줄 때는 앞 뒤로 +를 넣어줘야 함
		
		
		/*int a = 3;
		int b = 7;
		
		int result1 = a + b;
		System.out.println(result1);
		System.out.println("a와b를 더한 값은 " + result1 + "입니다."); (나 혼자 만들어 본 것)*/ 
		
		/*int value = 100;
		int result2 = value + 10;
		System.out.println(result2);*/
	}

}
