package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {

		
		String strVar1 = "홍길동";                       // 주소가 같음
		String strVar2 = "홍길동";

		if (strVar1 == strVar2) {                       // == 표시는 주소가 같냐고 물어보는 것
			System.out.println("strVar1과 strVar2 는 참조(주소)가 같음");
		} else {
			System.out.println("strVar1과 strVar2 는 참조(주소)가 다름");
		}

		if (strVar1.equals(strVar2)) {                   //.equals는 문자가 같은지 물어보는 것(대,소문자 구별...)
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("홍길동");           //new로 객체를 새로 만들어 줬기 때문에 주소가 다름
		String strVar4 = new String("홍길동");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조(주소)가 같음");
		} else
			System.out.println("strVar3과 strVar4는 참조(주소)가 다름");

		if(strVar3.equals(strVar4)) {
			System.out.println("strVar1과 strVar2 는 문자열이 같음");
		}
		
		
	}

}
