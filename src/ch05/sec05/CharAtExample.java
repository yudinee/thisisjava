package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {

		
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);  // charAt(6)은 0부터 시작해서 6번째 있는 숫자를 나타냄
		switch (sex) {
		case '1' :                  //6번째 있는 숫자가 1일때
		case '3' :                  //   ''          3
			System.out.println("남자입니다.");
			break;                  //       ''      2
		case '2' :
		case '4' :                  //      ''       4
			System.out.println("여자입니다.");
			break;
		}
		
		
	}

}
