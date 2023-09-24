package ch06.sec08.exam03;

public class CarExample {
	public static void main(String[] args) {


		//Car 객체 생성
		Car myCar = new Car ();
		
		//리턴값이 없는 setGas() 메소드 호출
		myCar.setGas(5);    //gas값은 5
		
		//isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if블록 실행
		if(myCar.isLeftGas()) {             // isLeftGas값은 5/ gas가 5이기 때문에 gas가 있습니다(if값) 실행 
			System.out.println("출발합니다.");  //if값 실행 후 실행
			
			//리턴값이 없는 run()메소드 호출
			myCar.run();
		}
	}

}
