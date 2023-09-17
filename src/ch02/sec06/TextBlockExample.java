package ch02.sec06;
/*
*	\" -> "문자 포함
*	\' -> '문자 포함
*	\\ -> \문자 포함
* 	\t -> 출력시 탭만큼 띄움
* 	\n -> 출력시 줄바꿈
*          \r -> 출력시 캐리지 리턴 
*   \ 표시 이클립스에서는  역슬레시 메모장에 이상하게 표시됨
*/
public class TextBlockExample {

	public static void main(String[] args) {

		String str1 = ""+
				"{\n" +
				"\t\"id\":\"winter\",\n"+
				"\t\"name\":\"눈송이\"\n"+
				"}";
				
				System.out.println(str1);
				System.out.println("--------------------------");
				
				
	/*			String str2 = """
						{
							"id":"winter",
							"name":"눈송이"
						}
						""";
				System.out.println(str2);
				System.out.println("----------------------------");
				
				
				String str = """
						나는 자바를 \
						학습합니다.
						나는 자바 고수가 될 것입니다.
						""";
				System.out.println(str);   // 28번줄 자바를 뒤에 \를 붙이면 자바를 학습합니다.가 한 줄에 나옴 
				
		"""은 버전 14이상부터 사용가능한데 나는 버전1이어서 안됨 	*/
						

	}

}
