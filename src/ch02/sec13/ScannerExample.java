package ch02.sec13;

//코맨드 + 쉬프트 + o 를쓰면 import불러올 수 있음
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		// 콘솔 부분에 x값, y값을 직접 입력할 수 있음
		
				Scanner scanner = new Scanner(System.in);
				
	
				System.out.println("X값 입력 : ");
				String strX = scanner.nextLine();
				int x = Integer.parseInt(strX);    // Integer를 사용하여 strX를 정수타입으로 변환
				
				System.out.println("y값 입력 : ");
				String strY = scanner.nextLine();
				int y = Integer.parseInt(strY);
				
				int result = x + y;
				System.out.println("x + y : " + result);
				
			
			
				
				
				while(true) {        //while문이 돌아가려면 true 여야함 false는 while문이 돌아가지 않음
					System.out.println("입력 문자열 : ");
					String data = scanner.nextLine();
					if(data.equals("q")) {      // 숫자가 같냐고 물어볼 때는 ==, 문자가 똑같냐고 물어볼때는 equals
						break;
					}
					
					System.out.println("출력 문자열 : " + data);
					System.out.println(); // 줄 한칸 띄기 용
				}
				System.out.println("종료");
				
				
	}

}
