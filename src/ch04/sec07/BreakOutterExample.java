package ch04.sec07;

public class BreakOutterExample {

	public static void main(String[] args) {


		// for문, while문, do-while문을 실행 중지하거나 조건문인 switch문을 종료할 때 사용 
		
				Outter: for(char upper = 'A'; upper <='Z'; upper++) {
					for(char lower ='a'; lower <= 'z'; lower++) {
						System.out.println(upper + "-" + lower);
						if(lower=='g') {     
							break Outter;
						}
					}
				}
				System.out.println("프로그램 실행 종료");
				
				//Outer은 for문이 밖에 for문까지 빠져나가게 해주는 장치 
		        //8번 줄의 Outer이 있는 for문을 종료해주라는 표시
		        //Outer가 없이 if에 break만 있으면 안쪽(나랑 가장 가까운) for문만 빠져나감
		        //Outer은 꼭 Outer이 아니라 아무 이름이나 써줘도 됨 
		
				
				
				
	}

}
