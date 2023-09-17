package ch04.sec06;

/*
 * while은 while옆의 조건 () 이 true일 경우에만 실행되는데 
 * do-while은 do 옆의 조건이 true이거나 false이거나 상관없이 무조건 실행
 * do가 먼저 실행된 후 while로 내려와서 while의 조건이 true일 경우 
 * do를 반복 실행, while의 조건이 false일 경우 종료 
 */
import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {

		
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {         // do 는 조건이 x, 무조건 한 번 실행
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println("q");
		} while ( ! inputString.equals("q")); // while이 true면 do를 반복 실행 false면 종료 
		
		System.out.println();
		System.out.println("프로그램 종료");
		
		
		

	}
	


}
