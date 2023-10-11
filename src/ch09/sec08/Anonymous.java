package ch09.sec08;

public class Anonymous {
	
	Vehicle field = new Vehicle() {
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	
	/*public void use() {
		field.run();
	}*/ //방법2
	
	void method1() {
		Vehicle localVar = new Vehicle() {
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();
	}
	
	void method2(Vehicle vc) {
		vc.run();
	}

}
