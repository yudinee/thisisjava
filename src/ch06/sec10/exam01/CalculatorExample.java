package ch06.sec10.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		
		// static은 생성자 선언x
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		//static은 주로 어느 곳에서 써도 고정된 값 (ex)pi값, 상수값s
	}

}
