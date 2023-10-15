package ch12.sec06;
/*
 * 포장 객체를 생성하기 위한 클래스는 java.lang 패키지에 포함되어 있는데
 * char 타입과 int타입이 각각 Character 와 Integer인 것만 제외하고는 기본 타입의 첫 문자를 대문자로 바꾼 이름을 가지고 있다.
 * 
 */
public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		//기본타입의 값을 포장 객체로 만드는 과정(변수를 만들어서 값을 넣음)을 박싱이라고 하고
		//반대로 포장 객체에서 기본 타입의 값을 얻어내는 과정(그 값을 다시 다른 곳에 넣음)을 언박싱이라 한다. 

		// Boxing(변수를 만들어서 값을 넣음)
		Integer obj = 100;
		System.out.println("value : " + obj.intValue()); //inValue()메소드는 Integer 객체 내부의 int 값을 리턴한다.

		// Unboxing(참조타입을 기본타입으로) (Boxing에서 만든 변수를 value값에 넣음)
		int value = obj;
		System.out.println("value : " + value);

		// 연산시 Unboxing
		int result = obj + 100;
		System.out.println("result : " + result);
	}

}
