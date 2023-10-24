package ch14.sec05.exam02;

public class SumThread extends Thread {
	
	// 계산 스레드의 작업이 종료된 후 그 결과값을 받아 처리하는 경우 join()메소드를 제공한다.

	// 다음은 sumThread가 계산 작업을 모두 마칠때까지 메인 스레드가 일시 정지 상테에 있다가
	// sumThread가 최종 계산된 결과값을 산출하고 종료하면 메인 스레드가 결과값을 받아 출력하는 예제이다.
	private long sum;

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	} // 외부에서 setter에 값을 넣어 줄 것이 아니라 set없어도 실행 됨

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
	}

}
