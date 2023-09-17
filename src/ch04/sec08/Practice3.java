package ch04.sec08;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {

		
		// q.7
		
				Scanner scanner = new Scanner(System.in);
				
				boolean run = true;
				int balance = 0;
				int select = 0;
				
				while(run) {
					System.out.println("-------------");
					System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
					System.out.println("--------------");
					System.out.println("선택 : ");
					
					select = scanner.nextInt();  //숫자일때는 nextInt, nextLine으로 하고 싶으면 int selct를 int가 아닌 String으로 해야함
					
					if(select == 1) {
						System.out.println("예금액 : ");
						balance += scanner.nextInt();
					}else if(select == 2) {
						System.out.println("출금액 : ");
						balance -= scanner.nextInt();
					}else if(select == 3) {
						System.out.println("잔고 : " + balance );
					}else {
						run = false;
					}
						
				}
				System.out.println("프로그램 종료");
				
	}

}
