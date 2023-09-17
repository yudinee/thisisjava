package ch03.sec06;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("x값 : " );
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		System.out.println();
		System.out.println(x);
		
		
		System.out.println("데이터를 입력하세요");
		String data = scanner.nextLine();
		System.out.println();
		System.out.println(data);   //콘솔창에 입력
		
		//data.equals("a");
		boolean result = data.equals("ㅎㅎ");  // 콘솔창에 입력한 a와 ㅎㅎ가 같냐
		System.out.println(result);
		
	}

}
