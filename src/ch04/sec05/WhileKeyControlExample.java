package ch04.sec05;

import java.util.Scanner;

public class WhileKeyControlExample {

	public static void main(String[] args) {

		
Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int speed = 0;
		
		while(run) {         //while은 true일 경우에만 작동
			System.out.println("------------------");
			System.out.println("1.증속 | 2. 감속 | 3. 중지");
			System.out.println("------------------");
			System.out.println("선택");
			
			String strNum = scanner.nextLine(); // while위에 쓰면 콘솔창에 아무것도 안뜸 따라서 꼭 while 밑에 쓰기 
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재속도 = " + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재속도 = " + speed);
			} else if(strNum.equals("3")) {      //else가 들어가면 3이나와도 중지, 4가 나와도 중지...따라서 else if 사용 
				run = false;
				System.out.println("run값을 false로 종료");
			}   //(15번에 시작된 while문 종료)
			
			System.out.println("프로그램 종료");
		}
		
		
		
		
	}

}
