package ch13.sec01;
/*
 * 제네릭 (generic)
 * 	결정되지 않은 타입을 파라미터로 처리하고 실제 사용할 때 파라미터를 구체적인 타입으로 대체시키는 기능
 * 
 * 	만약 Box의 내용물로 String을 저장하고 싶다면 다음과 같이 Box를 생성할 때 타입 파라미터 T대신 String으로 대체하면 된다.
 * 		Box<String> box = new Box<>();
 * 	
 * 	box의 내용물로 100을 저장하고 싶다면 파라미터 T대신 Integer로 대체하면 된다.
 * 		Box<Integer> box = new Box<>();
 * 		box.content = 100;
 * 		int content = box.content   
 * 
 *  주의할 점은 타입 파라미터를 대체하는 타입은 클래스 및 인터페이스라는 것이다. Box<int>라고 하지 않은 이유는 
 *  기본타입은 파라미터의 대체 타입이 될 수 없기 때문이다.
 */
public class Box<T> {   //타입 파라미터로 T 사용 
	public T content;

}
