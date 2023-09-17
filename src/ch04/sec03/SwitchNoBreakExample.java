package ch04.sec03;

public class SwitchNoBreakExample {

	public static void main(String[] args) {

		
		//swich문에 break를 뺀 경우 하나가 랜덤으로 출력되면 그 밑에 값도 같이 나옴
				
				
				int time = (int)(Math.random()*4)+8;
				System.out.println("현재시간 : " + time +"시");
				
				switch(time) {
				case 8 :
					System.out.println("출근합니다.");
					//break;
				case 9 : 
					System.out.println("회의합니다.");
				case 10 :
					System.out.println("업무봅니다.");
					default :
						System.out.println("외근나갑니다.");
					
				}
				
				
		
	}

}
