package ch12.sec05;

public class StringBuilderExample {
/*
 * String은 내부 문자열을 수정할 수 없다.
 * 잦은 문자열 변경 작업을 해야 한다면 String보다 StgringBuilder를 사용하는 것이 좋다.
 * 
 * 	append(기본값|문자열) -> 문자열을 끝에 추가
 * 	insert(위치, 기본값|문자열) -> 문자열을 지정 위치에 추가
 * 	delete(시작위치, 끝 위치) -> 문자열 일부를 삭제
 * 	replace(시작위치, 끝 위치, 문자열) -> 문자열 일부를 대체
 * 	toString() -> 완성된 문자열을 리턴 
 */
	public static void main(String[] args) {
		
		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4)
				.toString();
		System.out.println(data);
	}

}
