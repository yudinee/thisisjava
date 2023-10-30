package ch15.sec03.exan02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		// HashSet 컬렉션 생성
		Set<Member> set = new HashSet<Member>();

		// Member객체 저장 //인스턴스는 다르지만 동등 객체 이므로 객체 1개만 저장 (hashCode, equals를 통해 동등 객체로 만들어
		// 줌)
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));

		// 저장된 객체 수 출력
		System.out.println("총 객체 수 : " + set.size());

	}

}
