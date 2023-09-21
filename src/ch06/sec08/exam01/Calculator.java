package ch06.sec08.exam01;

public class Calculator {
	
	//리턴값 없는 메소드 선언
	void powerOn () {
		System.out.println("전원을 켭니다.");    //main메소드에서 실행 
	}                                         //리턴값x, 실행하고 끝
	
	//리턴값 없는 메소드 선언
	void powerOff () {
		System.out.println("전원을 끕니다.");
	}
	
	//호출 시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 int를 리턴하는 메소드 선언 
	int plus (int x, int y) {                  // int plus () {} int 옆에 변수(plus)있고, () {} 있으면 int는 리턴타입
		int result = x+y;
		//System.out.println(result);  /이렇게 해주고 CalculatorExample클래스에서 syso빼고 int result1 = myCalc.plus(5, 6); 문장만으로 출력 가
		return result;    //리턴값 지정           //void가 아닌 모든 메소드는 리턴값이 있어야 함
                                               //리턴타입, 결과값 있음 (ex) +,-,*,/...
	}
	
	//호출시 두 정수 값을 전달받고, 
	//호출한 곳으로 결과값 double을 리턴하는 메소드 선언 
	double divide (int x, int y) {
		double result = (double)x / (double)y;
		return result;    //리턴값 지정
	}

}
