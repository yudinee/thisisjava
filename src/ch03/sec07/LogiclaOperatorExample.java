package ch03.sec07;
/*
 * AND 논리곱 (그리고, ~이면서) && 또는 & (&&가 더 효율적) 조건을 모두 만족할 때 true (반드시 조건이 두개 이상)
 * OR 논리합 (또는, ~이거나) || 또는 | (||가 더 효율적) 조건 중 하나라도 만족하면 true (반드시 조건이 두개 이상)
 * XOR 배타적 논리합 ^ 피연산자가 하나는 true이고 다른 하나가 false일 경우에만 연산결과가 true (ex) true, false -> true / true, true -> false
 * NOT 논리부정 ! 피연산자의 논리값을 바꿈
 * 
 */
public class LogiclaOperatorExample {

	public static void main(String[] args) {


		int charCode = 'A';
		// int charCode = 'a';
		// int charCode = '5';
		
		if ( ( 65<= charCode) & (charCode <= 90) ) {
			System.out.println("대문자이군요.");
		}
		if ( (97 <= charCode) && (charCode <= 122) ) {
			System.out.println("소문자이군요.");
		}
		if ( ( 48<= charCode) && (charCode <= 57) ) {
			System.out.println("0~9 숫자이군요");
		}
		
		int value = 6;
		//int value = 7;
		
		if ( (value%2 == 0 ) | (value%3 == 0) ) {
			System.out.println("2 또는 3의 배수이군요");
		}
		boolean result = (value %2 == 0) || (value %3 == 0 );
		if( !result) {
			System.out.println("2또는 3의 배수가 아니군요");
		}
	}

}
