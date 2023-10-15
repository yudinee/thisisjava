package ch12.sec03.exam02;

public class HashCodeExample {

	public static void main(String[] args) {

		// 각각의 데이터는 고유값인 해시코드를 가지고 있다.

		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");

		if (s1.hashCode() == s2.hashCode()) { // 해시코드가 동일한지 검사
			if (s1.equals(s2)) { // 데이터가 동일한지 검사
				System.out.println("동등객체 입니다.");
			} else {
				System.out.println("데이터가 다르므로 동등객체가 아닙니다.");
			}
		} else {
			System.out.println("해시코드가 다르므로 동등 객체가 아닙니다."); // 10번줄이 아닐 경우
		}
	}

}
