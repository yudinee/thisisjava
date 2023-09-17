package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {

		
		// 정수는 %d, 문자열은 %s사
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value); //d앞에 숫자가 있으면 숫자만큼 공백 (6d는 왼쪽부터 6자리 공백)
		System.out.printf("상품의 가격:%-6d원\n", value);// -는 오른쪽 부터 공백
		System.out.printf("상품의 가격:%06d원\n", value);// 
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		
		
	}

}
