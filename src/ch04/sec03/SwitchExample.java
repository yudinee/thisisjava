package ch04.sec03;

public class SwitchExample {

	public static void main(String[] args) {

int num = (int)(Math.random()*6) +1;
		
		switch(num) {
		case 1 : 
			System.out.println("1번 나왔습니다.");
		break;
		case 2 :
			System.out.println("2번 나왔습니다.");
		break;
		case 3 :
			System.out.println("3번 나왔습니다.");
		break;
		case 4 :
			System.out.println("4번 나왔습니다.");
		break;
		case 5 :
			System.out.println("5번 나왔습니다.");
		break;
		default :    //derfault는 생략가능
			System.out.println("6번 나왔습니다.");
		}
		
		
	
			
	
	}

}
