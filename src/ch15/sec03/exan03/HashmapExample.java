package ch15.sec03.exan03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapExample {

	public static void main(String[] args) {

		// Map컬렉션 생성
		Map<String, Integer> map = new HashMap<>();

		// 객체 저장 //홍길동의 키가 같기 때문에 제일 마지막ㅔ 저장한 값만 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();

		// 키로 값 얻기
		String key = "홍길동";
		int value = map.get(key); // 키를 매개값으로 주면 값을 리턴(키를 주면 값을 알려줌)(홍길동 값을 value에 넣어 줌)
		System.out.println(key + ": " + value);
		System.out.println();

		// 키 set 컬렛션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet(); // 키를 반복하기 위해 반복자를 얻음
		Iterator<String> keyIterator = keySet.iterator(); // 키를 반복하기 위해 반복자를 얻음
		while (keyIterator.hasNext()) {
			String K = keyIterator.next();
			Integer V = map.get(K); // 주어진 키의 값을 리턴
			System.out.println(K + " : " + V);
		}
		System.out.println();

		// 엔트리 Set 컬렉션 얻고, 반복해서 키와 값을 얻기
		Set<Entry<String, Integer>> entrySet = map.entrySet(); // 엔트리를 반복하기 위해 반복자를 얻음 //entry -> 키 + 값
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator(); // 엔트리를 반복하기 위해 반복자를 얻음
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String K = entry.getKey();
			Integer V = entry.getValue();
			System.out.println(K + " : " + V);

		}
		System.out.println();

		// 키로 엔트리 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();

	}

}
