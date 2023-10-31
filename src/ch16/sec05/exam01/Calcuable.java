package ch16.sec05.exam01;
/*
 * 메소드 참조
 * 정적(static)메소드를 참조할 경우에는 클래스 이름 뒤에 :: 기호를 붙이고 정적 메소드 이름을 기술한다. 
 * 		클래스 :: 메소드
 * 인스턴스 메소드일 경우 먼저 객체를 생성한 다음 참조 변수 뒤에 :: 기호를 붙이고 인스턴스 메소드 이름을 기술한다. 
 * 		참조변수 :: 메소드
 */
@FunctionalInterface
public interface Calcuable {
	double calc(double x, double y);

}
