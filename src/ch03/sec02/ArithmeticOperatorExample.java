package ch03.sec02;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {


		//피연산자 정수타입(byte, short, char, int)이면 연산의 결과는 int타입니다.
		//피연산자가 정수타입이고 그 중 하나가 long타입이면 연산의 결과는 long타입이다.
		//피연산자 중 하나가 실수 타입이면 연산의 결과는 실수 타입이다.
		
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1 + v2;
		System.out.println("result 1 : " + result1);
		
		long result2 = v1 + v2 -v4;
		System.out.println("result2 : " + result2);
		
		double result3 =(double)v1 / v2;
		System.out.println("result3 : " + result3);
		
		//%연산자는 나눗셈을 수행한 후에 몫이 아닌 나머지를 산출하는 연산자
		int result4 = v1 % v2;   // 10%4 나머지는 0.5 그러나 이것을 정수로 반환한 것이 답(int이기때문에) 즉 답은 2
		System.out.println("result4 : " +result4);
		
		
		
	}

}
