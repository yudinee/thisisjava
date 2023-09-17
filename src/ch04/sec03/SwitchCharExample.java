package ch04.sec03;

public class SwitchCharExample {

	public static void main(String[] args) {
        //영어 대소문자에 관계없이 똑같이 처리
		//or일때 (조건이 두개 일때)
		//break 사용하지 않으면 밑에까지 출력
		
				char grade = 'b';
				
				switch(grade) {
				case 'A':
				case 'a':
					System.out.println("우수 회원입니다.");
					break;
				case 'B':
				case 'b':
					System.out.println("일반 회원입니다.");
					break;
					default:
						System.out.println("손님입니다.");
				}
				
			
		
	}

}
