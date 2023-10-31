package ch16.sec01;
/*
 * 람다식은 데이터 처리부에 제공되는 함수 역할을 하는 매개변수를 가진 중괄호 블록이다. 
 * 데이터 처리부는 람다식을 받아 매개변수에 데이터를 대입하고 중괄호를 실행시켜 처리한다. 
 * 
 * 람다식 : (매개변수, ...) -> {처리내용}
 * 
 * 람다식은 인터페이스의 익명 구현객체이므로 인터페이스 타입의 매개변수에 대입될 수 있다. 
 * 
 */
@FunctionalInterface
public interface Calculable {
	
	//추상 메소드
	void calculate(int x, int y);

}
