package ch08.sec07;

public class ServiceExample {
	public static void main(String[] args) {

		Service sc = new ServiceImpl();
		sc.defaultMethod1();
		System.out.println();
		sc.defaultMethod2();
		System.out.println();
		
		Service.staticMethod1();
		Service.staticMethod2();
	}

}
