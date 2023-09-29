package ch07.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원 면적 : " + calculator.areaCircle(r));
		System.out.println();
	
		
		Computer computer = new Computer();
		System.out.println("원 면적 : " + computer.areaCircle(r));
		//원래 부모이 생성자가 기본으로 들어가지만 오버라이딩을 통해 자식으로 수정됨 
	}

}
