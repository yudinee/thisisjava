package ch04.sec07;

public class BreakExample {

	public static void main(String[] args) {

		
		// for문, while문, do-while문을 실행 중지하거나 조건문인 switch문을 종료할 때 사용 
		
				while(true) {
					int num = (int)(Math.random()*6) +1;
					System.out.println(num);
					if(num==6) {
						break; // 6일때 while문 종료 14번줄(while문) 밖으로 빠져나감
						
					}
				} 
				
				System.out.println("프로그램 종료");
				
				
				
	}

}
