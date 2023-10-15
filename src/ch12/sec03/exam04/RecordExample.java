package ch12.sec03.exam04;

public class RecordExample {

	public static void main(String[] args) {

		Member m = new Member("winter", "눈송이", 25);
		System.out.println(m.id());  //getter 메소드 호출
		System.out.println(m.name());   //getter 메소드 호출
		System.out.println(m.age());    //getter 메소드 호출
		System.out.println(m.toString());
		System.out.println();
		
		Member m1 = new Member("winter", "눈송이", 25);
		Member m2 = new Member("winter", "눈송이", 25);
		System.out.println("m1.hashCode(): " + m1.hashCode());
		System.out.println("m2.hasgCode(): " + m2.hashCode());
		System.out.println("m1.equals(m2): " + m1.equals(m2));  //동등비교
	}

}
