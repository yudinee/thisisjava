package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {

		// 기본타입 크기 
				// byte < short, char < int < long < float < double
				
				//byte bytevalue = 65;
				//char charvalue = bytevalue ->컴파일에러 (byte는 음수표현이 되지만 char는 음수표현이 되지 않기때문에 컴파일에러)
				
				byte byteValue = 10;
				int intValue = byteValue;
				System.out.println("intValue : " + intValue);
				
				
				char charValue = '가';
				intValue = charValue;  //앞에 int 변수선언 안해서 컴파일 에러 나지 않음 
				System.out.println("가의 유니코드 : " + intValue); // charvalue였으면 문자가 나오겠지만 intvalue여서 숫자가 출력
				
				
				
				intValue = 50;
				long longValue = intValue;
				System.out.println("longValue : " + longValue);
				
						
				longValue = 100;
				float floatValue = longValue;
				System.out.println("floatValue : " + floatValue); // long을 float으로 변환하면 소숫점이 추가돼서 나옴 
				
				floatValue = 100.5F;
				double doubleValue = floatValue;
				System.out.println("doubleValue : " + doubleValue);
				
				
	}

}
