package ch14.sec05.exam03;

public class WorkThread  extends Thread{
	
	// 다른 스레드에게 실행을 양보하고 자신은 실행 대기 상태로 가는 기능을 위해 yield()메소드를 제공한다.

	// 다음예제에서는 처음 5초 동안은 ThreadA와 ThreadB가 번갈아 가며 실행하다 5초 뒤에 메인스레드가 Thread의 work 필드를
	// false로 변경함으로써 ThreadA()가 yield()메소드를 호출한다.
	// 따라서 ThreadB가 더 많은 실행 기회를 얻게 된다. 그리고 10초 뒤에 ThreadA의 work필드를 true로 변경해
	// ThreadA와 ThreadB가 다시 번갈아 되며 실행된다.
	// 필드
	
	
	public boolean work = true;

	// 생성자
	public WorkThread(String name) {
		setName(name);
	}

	// 메소드
	@Override
	public void run() {
		while (true) { // while믄에 break, return이 없어서 계속 돌아감
			if (work) { // work -> true
				System.out.println(getName() + ": 작업처리");
			} else {
				Thread.yield(); // work가 false일 경우 //스레드를 양보
			}
		}
	}

}
