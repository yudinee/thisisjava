package ch14.sec03exam03;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {

		// 스레드 자식 클래스로 생성
		// Thread thread = new Thread()에 runnable넣지 않고 자식클래스로 만들어서 사용

		Thread thread = new Thread() {
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
		};

		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
