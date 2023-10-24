package ch13.sec01;

public class GenericExample {

	public static void main(String[] args) {

		// Box<String> box1 = new Box<String>();
		// 변수 선언할 때아 동일한 타입으로 호출하고 싶다면 생성자 호출 시 타입을 명시하지 않고 <>만 붙일 수 있다
		Box<String> box1 = new Box<>(); // Box를 생성할 때 타입 파라미터 T대신 String으로 대체
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);

		// Box<Integer> box2 = new Box<Integer> ();
		Box<Integer> box2 = new Box<>(); // Box를 생서할 떼 파라미터 T대신 Integer로 대체
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
	}

}
