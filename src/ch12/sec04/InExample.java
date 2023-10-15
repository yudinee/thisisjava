package ch12.sec04;

import java.io.IOException;

public class InExample {

	public static void main(String[] args) throws Exception {

		// System클래스의 정적(static)필드와 메소드를 이용하면 프로그램 종료, 키보드 입력, 콘솔(모니터) 출력, 현재시간 읽기, 시스템
		// 프모퍼터 읽기 등이 가능하다.
		// 자바는 키보드로부터 입력된 키를 읽기 위해 System클래스에서 in 필드를 제공한다.
		// in필드를 이용해서 read() 메소드를 호출하면 입력된 키의 코드값을 얻을 수 있다.

		int speed = 0;
		int keyCode = 0;

		while (true) {
			// Enter 키를 읽지 않았을 경우에만 실행
			if (keyCode != 13 && keyCode != 10) {
				if (keyCode == 49) { // 숫자키 1을 읽었을 경우
					speed++;
				} else if (keyCode == 50) { // 숫자키 2를 읽었을 경우
					speed--;
				} else if (keyCode == 51) { // 숫자키 3을 읽었을 경우
					break;
				}
				System.out.println("----------------");
				System.out.println("1.증속 | 2. 감속 | 3. 중지");
				System.out.println("------------------");
				System.out.println("현재속도 = " + speed);
				System.out.println("선택 : ");
			}

			// 키를 하나씩 읽음
			keyCode = System.in.read();
		}
		System.out.println("프로그램 종료");
	}

}
