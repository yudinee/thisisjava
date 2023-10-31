package ch16.sec04;
/*
 * 리턴값이 없는 람다식
 * return 문이 하나만 있을 경우 중괄호와함께 return 키워드를 생략할 수 있다. 
 * 리턴값은 연산식 또는 리턴값 있는 메소드 호출로 대체할 수 있다.
 * 
 */
@FunctionalInterface
public interface Calcuable {
	double calc(double x, double y);

}
