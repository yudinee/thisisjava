package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {

		
		String board = "번호/ 제목/ 내용/ 성명";  
		String[] arr = board.split("/");   // [] -> 배열 ( 위의 것을 하나씩 잘라서 넣는다.)
		// split() 따로 분리해서 얻고 싶을 때 //board(변수이름(아무거나 상관x))는 쉼표로 구분된 문자열을 가지고 있다. 
		System.out.println(arr[0]);
		System.out.println();
		
		
		String board1 = "1, 자바 학습, 찹조타입 String을 학습합니다., 홍길동";
				
		String[] tokens = board1.split(",");
		
		System.out.println("번호 : " + tokens[0] );
		System.out.println("제목 : " + tokens[1]);
		System.out.println("내용 : " + tokens[2]);
		System.out.println("성명 : " + tokens[3]);
		
		for(int i=0; i<tokens.length; i++) {     //tokens.lenth는 토큰이 갖고 있는게 총 몇개냐?(4개) (tokens는 4)
			                                     //i부분은 항상 tokens부분보다 작아야함 
	 		System.out.println(tokens[i]);       
		}
		
		
	}

}
