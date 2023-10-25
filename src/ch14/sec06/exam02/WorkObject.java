package ch14.sec06.exam02;
/*
 * wait()와 notify를 이용한 스레드 제어
 * 	정확한 교대 작업이 필요할 경우, 자신의 작업이 끝나면 상대방 스레드를 일시정지 상태에서 풀어주고 자신은 일시정지 상태로 만들면 된다.
 * 	한 스레드가 작업을 완료하면 notify() 메소드를 호출해서 일시 정지 상태에 있는 다른 스레드를 실행 대기 상태로 만들고
 * 	자신은 두 번 작업을 하지 않도록 wait()메소드를 호출하여 일시 정지 상태로 만든다. 
 * 
 * notify()는 wait()에 의해 일시 정지된 스레드 중 한 개를 실행 대기로 만들고, notifyAll()은 wait()에 의해 일시 정지된 모든 스레드를 실행 대기 상태로 만든다. 
 * 
 * 동기화 블록 또는 동기화 메소드에서만 사용할 수 있다. 
 * 
 * 
 */
public class WorkObject {

	// 다음 예제는 WorkObject에 두 스레드가 해야 할 작업을 동기화 메소드인 methodA()와 methodB()로 각각 정의해 두고,
	// ThreadA와 ThreadB가 교대로 methodA() 와 methodB()를 호출하도록 한 것이다.
	public synchronized void methodA() { // 동기화 메소드
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": method 작업 실행");
		notify(); // 다른 스레드를 실행 대기로 만듬
		// 내가 일시정지로 가기 위해서 일시정지에 있던 애를 실행대기로 보냄
		try {
			wait(); // 자신의 스레드를 일시 정지 상태로 만듬
		} catch (InterruptedException e) {

		}
	}

	public synchronized void methodB() { // 동기화 메소드
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodB  작업 실행");
		notify(); // 다른 스레드를 실행 대기로 만듬
		// 내가 일시정지로 가기 위해서 일시정지에 있던 애를 실행대기로 보냄
		try {
			wait(); // 자신의 스레드를 일시 정지 상태로 만듬
		} catch (InterruptedException e) {

		}
	}

}
