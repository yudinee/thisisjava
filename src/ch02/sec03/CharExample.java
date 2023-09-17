package ch02.sec03;

public class CharExample {

	public static void main(String[] args) {

			char c1 = 'A';
			char c2 = 65;
			
			char c3 = '가';
			char c4 = 44032;
			
			System.out.println(c1); //c1에는 A의 값인 65가 들어갔지만 char타입이 숫자를 문자로 변환해 주기 때문에 A로 표시됨
			System.out.println(c2);
			System.out.println(c3);
			System.out.println(c4);
			
	}

}
