package ch15.sec03.exan03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		// HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();

		// 객체 추가
		set.add("java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");

		// 객체를 하나씩 가져와서 처리
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			// 객체를 하나 가져오기
			String element = iterator.next(); // true를 리턴할 때 // 가져올게 없으면 false가 돼서 while문을 빠져나옴
			System.out.println(element);
			if (element.equals("JSP")) { // 똑같지 않으면 지우지x
				// 가져온 객체를 컬렉션에서 제거
				iterator.remove();
			}
		}

		System.out.println();

		// 객체 제거
		set.remove("JDBC");

		// 객체를 하나씩 가져와서 처리
		for (String element : set) {
			System.out.println(element);
		}
	}
}
