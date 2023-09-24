package ch06.sec08.exam02;

public class Computer {
	
	//가변길이 매개변수를 갖는 메소드 선언
		int sum (int...values) {       //int가 갖고있는 values가 몇개인지 모름  //리턴타입
			
			//sum 변수 선언 
			int sum =0;
			
			//values는 배열타입의 변수처럼 사용 
			for(int i=0; i<values.length; i++) {
				sum += values[i];
			}
			
			//합산 결과를 리턴 
			return sum;
		}
}
