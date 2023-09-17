package ch02.sec08;
/*
 * 캐스팅을해서 작은 타입을 큰 타입으로 강제변환
 *	 int -> byte
 * 		int intValue = 10;
 * 		byte byteValue = (byte) intValue; -> 강제타입 변환
 * 	long -> int 
 * 		long longValue = 300;
 * 		int intValue = (int) longValue; -> 강제 타입 변환 후에 300이 그대로 유지
 * 	int -> char
 * 		int intValue = 65;
 * 		char charValue = (char) intValue;
 * 		System.out.println(charValue); -> A가 출력
 * 	실수 -> 정수
 * 		double doublevalue = 3.14;
 * 		int intValue = (int) doubleValue; -> intValue는 정수 부분인 3만 저장
 * 
 */
public class CastingExample {

	public static void main(String[] args) {

		int var1 = 10;
		byte var2 = (byte) var1;
		System.out.println(var2);
		
		
		long var3 = 300;
		int var4 = (int) var3;
		System.out.println(var4);
		
		
		int var5 = 65;
		char var6 = (char) var5;
		System.out.println(var6);
		
		
		
		double var7 = 3.14;
		int var8 = (int) var7;
		System.out.println(var8);
		
		
	}

}
