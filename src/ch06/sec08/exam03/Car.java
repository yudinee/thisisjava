package ch06.sec08.exam03;

public class Car {

	//필드 선언
	int gas;
	
	//리턴값이 없는 매개값을 받아서 gas 필드값 변경
	void setGas(int gas) {
		this.gas=gas;
	}
		
	//리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를, 0이 아니면 true를 리턴
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;   //false를 리턴하고 메소드 종료  //return은 가장 마지막에 해줘야 함 syso전에 하면 오류 
		}
		System.out.println("gas가 있습니다.");
		return true;     //true를 리턴하고 메소드 종료      //return은 가장 마지막에 해줘야 함 syso전에 하면 오류 
		
	}
	
	//리턴값이 없는 메소드로 gas 필드값이 0이면 return 문으로 메소드를 종료
	void run () {
		while (true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량 : " + gas + ")");
				gas -= 1;
			}else {
				System.out.println("멈춤니다.(gas잔량 : \" + gas + \")");
				return;  //메소드 종료  //fasle, break역할 (while문을 빠져나가기 위해서)
				//여기서 return은 while문 안에 있는거 void run에 있는거 아님
			}
		}
	}
	}

