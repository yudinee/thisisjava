package ch05.sec06;
/*
 * 일반 변수는 변수 먼저 선언하고 값을 넣을 수 있지만 배열은 그렇게 못 함
 * 선언하고 바로 넣어야 함
 * 만약 나중에 해주고 싶으면 new 타입 [] {1,2,3...}; 이렇게 해주면 됨
 * 
 */
public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {

		

		int[] scores;
		scores = new int[] {83, 90, 87};    //한번에 하면 int[] scores = {83, 90, 87};
		
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		
		
		printItem(new int[] {99,100,101,102}); 
	} // 메인메소드 끝남
	
	// printItem() 메소드 선언
	public static void printItem( int[] arg ) {      //arg는 아무이름이나 써줘도 됨 됨  //printItem도 23번과 맞춰서 아무이름이나 써도 
		//매개변수가 참조하는 배열의 항목을 출력
		for(int i=0; i<4; i++) {
			System.out.println("score[" + i + "]:" + arg[i]);
			
			//23번 줄의 pritItem을 사용하기 위해 여기서(27번) printItem을 선언해줌
			//27의 int[]를 실행하기 위해서 23번에 new int[]를 해줌
		}
		
		
	
	}

}
