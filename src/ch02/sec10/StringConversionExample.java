package ch02.sec10;
/*
 * String은 모든 기본 타입으로 변환할수 있다. 
 * 	ex) String -> byte
 * 			Stirng str = "10";
 * 			byte value = Byte.parseByte(str);
 * 		String -> short
 * 			String str = "200";
 * 			short value = Short.parseShort(str);
 * 		***String -> int
 * 			Srting str = "300000";
 * 			int value = Integer.parseInt(str);
 * 				.
 * 				.	
 * 				.
 * 이런식으로 모든 기본값 변환 가능
 * = 뒤와 parse뒤에 기본값 시작 알파벳은 대문자
 * int는 int.parse가 아닌 Intger.parseInt
 * 
 */
public class StringConversionExample {

	public static void main(String[] args) {
		

		int value1 = Integer.parseInt("10");   //큰따음표 표시가 있기때문에 String타입이라고 선언하지 않아도 됨
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
		
		
		
		String str1 = String.valueOf(10);   //숫자를 String타입으로 값을 빼기 위해 valuOf가 들어감
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		
		
		
		
	}

}
