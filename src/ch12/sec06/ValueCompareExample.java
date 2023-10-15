package ch12.sec06;
/*
 * 포장 값 비교
 * 포장 객체는 내부 값을 비교하기 위해 ==와 != 연산자를 사용할 수 없다.
 * 이 연산은 내부의 값을 비교하는 것이 아니라 포장 객체의 번지를 비교하기 때문이다.
 * 
 * 예외도 있다.
 * 이 범위의 값을 갖는 포장 객체는 ==와 != 연산자로 비교할 수 있지만, 값을 비교하는 것이 아니라 객체 번지를 비교한다는 것을 알아야 한다.
 * byte, short, int  ->  -128~127
 * 
 * 포장객체에 정확히 어떤 값이 저장될 지 모르는 상황이라면 equals()메소드를 사용하는 것이 좋다. 
 */
public class ValueCompareExample {

	public static void main(String[] args) {

		// -128~127 초과값일 경우

		Integer obj1 = 300;  
		Integer obj2 = 300;
		System.out.println("== : " + (obj1 == obj2));  //Integer 대신 long을 넣으면 여기도 true로 나옴 
		System.out.println("equals(): " + obj1.equals(obj2));

		// -128~127 범위값일 경우
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("== : " + (obj3 == obj4));
		System.out.println("equals(): " + obj3.equals(obj4));
	}

}
