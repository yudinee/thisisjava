package ch04.sec02;
/*
 * 임의의 정수를 뽑기 위해 math.ramdom() 메소드를 활용할 수 있다. 
 * 	int num = (int) (Math.random() * n ) + start; -> int로 강제 형변환  
 * 	int num = (int) (Math.random() * 45 ) + 1;  -> 45는 내가 사용할 갯수, 1은 시작할 번호 (1부터 시작)
 */
public class IfDiceExample {
	
	public static void main(String[] args) {
		
int num = (int) (Math.random() * 6 ) + 1;
		
		if (num == 1) {
			System.out.println("1번 나왔습니다.");
		} else if(num == 2) {
			System.out.println("2번 나왔습니다.");
		} else if(num == 3) {
			System.out.println("3번 나왔습니다.");
		} else if(num == 4) {
			System.out.println("4번 나왔습니다.");
		} else if(num == 5) {
			System.out.println("5번 나왔습니다.");
		} else {
			System.out.println("6번 나왔습니다.");
		}
			
		
	}

}
