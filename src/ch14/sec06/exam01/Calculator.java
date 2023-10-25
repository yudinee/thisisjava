package ch14.sec06.exam01;
/*
 * 스레드가 사용 중인 객체를 다른 스레드가 변경할 수 없도록 하려면 스레드 작업이 끝날 때까지 객체에 잠금을 걸면 된다.
 * 이를 위해 자바는 동기화 메소드와 블록을 제공한다.
 * 객체 내부에 동기화 메소드와 블록이 여러 개가 있다면 스레드가 이들 중 하나를 실행할 때 다른 스레드는 해당 메소드는 물론이고 
 * 다른 동기화 메소드 및 블록도 실행할 수 없다. 하지만 일반 메소드는 실행 가능하다. 
 * 
 * 동기화 메소드를 선언하는 방법은 synchronized키워드를 붙이면 된다.
 * 
 * 동기화 메소드를 실행하는 즉시 객체는 잠금이 일어나고, 메소드 실행이 끝나면 잠금이 풀린다. 
 * 메소드 전체가 아닌 일부 영억을 실행할 때만 객체 잠금을 걸고 싶다면 동기화 블록을 만들면 된다. 
 */
public class Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory1(int memory) { // 동기화 메소드
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory); // this.memory -> memory값 읽기
	}

	public void setMemory2(int memory) {
		synchronized (this) { // 동기화 블록
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory); // this.memory -> memory값 읽기
		}
	}

}
