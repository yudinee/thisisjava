package ch14.sec05.exam03;

public class YieldExample {

	public static void main(String[] args) {

		WorkThread workThreadA = new WorkThread("workThreadA");   //매개변수 name
		WorkThread workThreadB = new WorkThread("workThreadB");   //매개변수 name
		workThreadA.start();
		workThreadB.start();
		
		try {Thread.sleep(5000); } catch (InterruptedException e) {}
		workThreadA.work = false;   //B가 돌아감(A가 false여서)
		
		try {Thread.sleep(10000); } catch (InterruptedException e) {}
		workThreadA.work = true;   //A가 돌아감
	}

}
