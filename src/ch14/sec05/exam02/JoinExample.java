package ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {

		SumThread sumThread = new SumThread();

		sumThread.start(); // 실행 대기 -> SumThread클래스의 run()실행
		try {
			sumThread.join(); // SumThread 클래스가 계산을 모두 마칠 때 까지(run()메소드 종료할 때 까지) 메인 스레드는 일시정지
								// SumThread가 최종 계상된 결과값을 산출하고 종료하면 메인 스레드가 결과값을 받아서 출력

		} catch (InterruptedException e) {

		}
		System.out.println("1~100 합 : " + sumThread.getSum());
	}

}
