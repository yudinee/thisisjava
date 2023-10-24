package ch14.sec05.exam01;

import java.awt.Toolkit;

/*
 * 스레드 객체를 생성(NEW)하고, start() 메소드를 호출하면 곧바로 스레드가 실행되는 것이 아니라 실행 대기 상태(RUNNABLE)가 된다.
 * 스레드는 실행 대기 상태와 실헹 상태를 번갈아 가면서 자신의 run()메소드를 조금씩 실행한다.
 * 실행 상태에서 run()메솓으가 종료되면 더 이상 실행할 코드가 없기 때문에 스레드의 실행은 멈추게 된다. 
 * 실행 상태에서 일시정지 상태로 가기도 하는데 일시 정지 상태는 스레드가 실행할 수 없는 상태를 말한다. 
 * 스레드가 다시 실행 상태로 가기 위해서는 일시정지 상태에서 실행대기 상태로 가야만 한다. 
 * 
 * 
 * 일시 정지로 보냄
 * 	sleep(long millis)
 * 		주어진 시간 동안 스레드를 일시 정지 상태로 만든다. 주어진 시간이 지나면 자동적으로 실행 대기 상태가 된다.
 * 	join()
 * 		join() 메소드를 호출한 스레드는 일시 정지 상태가 된다. 실행 대기 상태가 되려면, join()메소드를 가진 스레드가 종료되어야 한다.
 * 	wait()
 * 		동기화 블록 내에서 스레드를 일시 정지 상태로 만든다. 
 * 
 * 일시 정지에서 벗어남
 * 	interrupt()
 * 		일시 정지 상태일 경우, intteruptException을 발생 시켜 실행 대기 상태 또는 종료 상태로 만든다..
 * 	notify() //각각,  notify All() //전체
 * 		wait()메소드로 인해 일시 정지 상태인 스레드를 실행 대기 상태로 만든다.
 * 
 * 실행 대기로 보냄
 * 	yield()
 * 		실행 상태에서 다른 스레드에게 실행을 양보하고 실행 대기 상태가 된다. 
 */
public class SleepExample {

	public static void main(String[] args) {

		// 일정 시간 멈추게 하고 싶다면 Thread 클래스의 정적 메소드인 sleep()을 이용하면 된다.
		// 매개값에는 얼마 동안 일시 정지 상태로 있을 것인지 밀리세컨드(1/1000)단위로 시간을 주면
		// 일시 정지 상태에서는 InterruptedException이 발생할 수 있기 때문에 sleep()은 예외처리가 필요한 메소드 이다.
		
		

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

			}
		}

	}

}
