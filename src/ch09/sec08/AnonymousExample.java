package ch09.sec08;

public class AnonymousExample {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous();

		anony.field.run();
		// anony.use(); //방법2
		anony.method1();

		anony.method2(new Vehicle() {
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		});
	}

}
