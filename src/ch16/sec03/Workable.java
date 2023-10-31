package ch16.sec03;
/*
 * 매개변수가 있는 람다식
 * 매개변수를 선언할 때 타입은 생략할 수 있고, 구체적인 타입 대신 var를 사용할 수도 있다.
 * 하지만 타입을 생략하고 작성하는 것이 일반적이다. 
 * 매개변수가 하나일 경우에는 괄호를 생략할 수도 있다.이때는 타입 또는 var를 붙일 수 없다.
 */
@FunctionalInterface
public interface Workable {
	void work(String name, String job);  //매개변수 o

}
