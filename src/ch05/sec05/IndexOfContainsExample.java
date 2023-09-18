package ch05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {

		

		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");   //indexOf()는 문자열의 위치를 찿을 때 사용 '프'가 3번지에 위치
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		if(location != -1) {                           //0부터 시작하기때문에 -1은 있을 수 없음
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		
		boolean result = subject.contains("자바");      //contains()는 문자가 포함되어 있는지 물은 것 있으면 true 없으면 false
		if(result) {                                   //contains()는 true false를 묻는 것이기 때문에 boolean을 씀
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련 없는 책이군요");
		}

		
		
		
		
	}

}
