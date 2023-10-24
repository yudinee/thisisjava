package ch14.sec03exam02;

import java.awt.Toolkit;

public class BeepExample {

	public static void main(String[] args) {

		// beep음을 발생시키면서 동시에 "띵"소리 주기 
		Thread thread = new Thread(new Runnable() { // 작업 스레드 생성 //runnable - > 스래드 작업을 실행할 때 사용하는 인터페이스
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}
		});

		Thread thread1 = new Thread(new Runnable() { // 작업 스레드 생성
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
			}
		});

		thread.start(); // 작업 스레드 실행

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

		thread1.start(); // 스레드는 만든 위치는 상관없고 thread.start()가 있으면 실행
		
		for (int i = 0; i < 5; i++) {
			System.out.println("땡");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

	}

}
