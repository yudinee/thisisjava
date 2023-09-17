package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {

		//char var1 = "A";  
				//char var2 = "홍길동";  -> char타입은 작은따음표 사용, 큰따음표 사용해서 컴파일 에러
				
				String var1 = "A";
				String var2 = "홍길동";
				
				
				String name = "홍길동";
				String job = "프로그래머";
				System.out.println(name);
				System.out.println(job);
				
				String str = "나는 \"자바\"를 배웁니다.";
				System.out.println(str);
				
				str = "번호\t이름\t직업";
				System.out.println(str);
				
				System.out.print("나는\n");
				System.out.print("자바를\n");
				System.out.println("배웁니다.");
				
			
				
				
	}

}
