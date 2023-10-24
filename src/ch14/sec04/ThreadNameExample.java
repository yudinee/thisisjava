package ch14.sec04;
/*
 * 메인 스레드는 'main'이라는 이름을 가지고 있고
 * 작업 스레드는 자동적으로 'Thread - n'이라는 이름을 가진다. 
 * 작업 스레드를 다른 이름으로 설정하고 싶으면 Thread클래스의 setName() 메소드를 사용하면 된다. 
 * 
 * 현재 코드를 어떤 스레드가 실행하고 있는 지 확인하는 정적 메소드 currentThread()로 스레드 객체의 참조를 얻은 다응
 * 	Thread thread = Thread.currentThread();
 * getName()메소드로 이름을 출력해보면 된다.
 * 	System.out.println.getName();
 * 
 */
public class ThreadNameExample {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread(); // 현재 코드를 어떤 스레드가 실행하고 있는지 확인 // 이 코드를 실행하는 스레드 객체 참조 얻기
		System.out.println(mainThread.getName() + "실행"); // 지금현재 실행하는 스레드 실행(메인스레드) (객체를 안만들어서 메인스레드 실행 됨)

		for (int i = 0; i < 3; i++) { // for문 안에 스레드는 순서 랜덤
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + "실행"); // getName()메소드는 Thread의 인스턴스 메소드로 스레드의 이름을 리턴
				}
			};

			threadA.start();
		}

		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + "실행");
			}
		};

		chatThread.setName("chat-thread"); // 작업 스레드 이름 변경
		chatThread.start();

		/*
		 * for (int i = 0; i < 3; i++) { Thread thread1 = new Thread() {
		 * 
		 * @Override public void run() { for (int j = 0; j < 100; j++) {
		 * System.out.println(getName()+ "-" + j); } } };
		 */

	}

}
