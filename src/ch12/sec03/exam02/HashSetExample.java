package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {

		// Hashset은 동등객체를 중복 저장하지 않는 특징이 있다.
		// Hashset은 hashCode()와 equals() 메소드를 이용해서 동등 객체인지 판단한다.

		HashSet hashSet = new HashSet(); // Hashset 컬렉션 생성

		Student s1 = new Student(1, "홍길동");
		hashSet.add(s1); // HasgSet에 Student 객체 저장 //add(s1) -> s1에 넣어라
		System.out.println("저장된 객체 수 :" + hashSet.size()); // 객체 몇개 있는지 묻는 것

		Student s2 = new Student(1, "홍길동");
		hashSet.add(s2); // HashSet에 Student 객체 저장
		System.out.println("저장된 객체 수 : " + hashSet.size()); // 해시코드 검사해서 동등객체면 중복 저장되지 않음

		Student s3 = new Student(2, "홍길동");
		hashSet.add(s3); // HashSet에 Student 객체 저장
		System.out.println("저장된 객체 수 : " + hashSet.size());

		// s1객체와 s2객체는 학생 번호와 이름이 같기 때문에 동등객체이다. 따라서 s2가 저장될 때 이미 s1이 저장되어 있으므로 중복 저장되지
		// 않는다.

	}

}
