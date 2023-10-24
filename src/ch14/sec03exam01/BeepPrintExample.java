package ch14.sec03exam01;

import java.awt.Toolkit;
/*
 * 모든 자바 프로그램은 메인 스레드가 main() 메소드를 실행하면서 시작된다.
 * 메인 스레드는 main() 메소드의 첫 코드부터 순차적으로 실행하고, main() 메소드의 마지막 코드를 실행하거나 return문을 만나면 실행을 종료한다.
 * 싱글 스레드에서는 메인 스레드가 종료되면 프로세스도 종료된다. 
 * 하지만 멀티 스레드에서는 실행중인 스레드가 하나라도 있다면 프로레스는 종료되지 않는다. 
 * 메인 스레드가 작업스레드보다 먼저 종료되더라도 작업 스레드가 계속 실행 중이라면 프로세스는 종료되지 않는다.
 * 
 * 자바 프로그램은 메인 스레드가 반드시 존재하기 때문에 메인 작업 이외에 추가적인 작업 수만큼 스레드를 생성하면 된다. 
 * 
 * Thread 클래스로부터 작업 스레드 객체를 직접 생성하려면 Runnable 구현 객체를 매개값으로 갖는 생성자를 호출하면 된다.
 * 	Runnable은 스레드가 작업을 실행할 때 사용하는 인터페이스이다. 
 */
public class BeepPrintExample {

	public static void main(String[] args) {

		// 다음은 메인 스레드가 동시에 두 가지 작업을 처리할 수 없음을 보여주는 예제이다.

		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit객체 얻기 (Toolkit -> beep 소리를 내는 클래스) //getDefaultToolkit
														// -> toolkit에 있는 메소드

		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // beep음 발생
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			} // thread가 갖고있는 sleep 메소드 //0.5초간 일시정지(1000에 1초)

		}

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			} // 실행하다 오류나면 에러처리를 exception에서하고, 정상종료 하게 해주기 위해 try, catch사용
		}

		// 소리 먼저 나고, "띵"문자 실행
	}
}
