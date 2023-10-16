package ch12.sec11.exam01;
/*
 * 리플렉션
 *	메타정보(패키지 정보, 타입 정보, 멤버(생성자, 필드, 메소드)정보 등)를 읽고 수정하는 행위
 *
 * class 객체를 얻는 방법
 * 	Class clazz = 클래스이름.class;  -클래스로부터 얻는 방법 
 * 	Class clazz = Class.forName("패키지...클래스이름");  -클래스로부터 얻는 방법
 * 	Calss clazz = 객체참조변수.getClass();  -객체로부터 얻는 방법
 * 
 * 패키지와 타입(클래스, 인터페이스) 이름 정보는 다음 메소드를 통해 얻을 수 있다.
 * 	메소드						용도
 * 	Package getPackage() 		패키지 정보 읽기
 * 	String getSimpleName()		패키지를 제외한 타입 이름
 * 	String getName()			패키지를 포함한 전체 타입 이름 
 */
public class GetClassExample {

	public static void main(String[] args) throws Exception {

		//how1
		Class clazz = Car.class;
		
		//how2
		//Class clazz = Class.forName("ch12.sec11.exam01.Car");
		
		//how3
		//Car car = new Car();
		//Class clazz = car.getClass();
	
		System.out.println("패키지 : " + clazz.getPackage().getName());
		System.out.println("클래스 간단 이름 : " + clazz.getSimpleName());
		System.out.println("클래스 전체 이름 : " + clazz.getName());
		
		
	}

}
