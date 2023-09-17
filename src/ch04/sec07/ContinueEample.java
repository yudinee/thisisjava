package ch04.sec07;

public class ContinueEample {

	public static void main(String[] args) {

		// for문, while문, do-while문에서 실행 
				for(int i=1; i<=10; i++) {
					if(i%2 != 0) {     //if가 true면 continue실행, 다시for문으로 올라감
						continue;      //continue가 false면 syso실행 
					}
					System.out.print(i + " ");  // for조건에 만족할때까지 반복
				}
				
				// 원래 if문의 경우 true면 끝나게 되는데 continue가 있어서 한번 더 실행 
				
				for(int a=1; a<=10; a++) {
					if(a%2 != 0) {
						continue;
					}
					System.out.print(a + " ");
				}
			
	}

}
