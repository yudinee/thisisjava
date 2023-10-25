package ch14.sec07.exam02;

public class PrintThread extends Thread {

	// interrupt() 메소드는 스레드가 일시 정지 상태에 있을 때 interruptedException을 발생시키는 역할을 한다.
	// 이것을 이용하면 예외처리를 통해 run()메소드를 정상 종료시킬 수 있다.

	public void run() {
		try {
			while (true) {
				System.out.println("실행중");
				Thread.sleep(1); // 일시 정지로 만듦(interruptedException이 발생할 수 있도록)
			}
		} catch (InterruptedException e) {

		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}

}
