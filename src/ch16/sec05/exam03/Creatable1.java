package ch16.sec05.exam03;
/*
 * 생성자 참조
 * 생성자를 참조한다는 것은 객체를 생성하는 것을 의미한다. 
 * 클래스 이름 뒤에 :: 기호 붙이고 new연산자를 기술하면 된다. 
 * 		클래스 :: new
 */
@FunctionalInterface
public interface Creatable1 {
	
	public Member create(String id);

}
