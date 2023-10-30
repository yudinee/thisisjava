package ch15.sec02.exan03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		// ArrayList컬렉션 객체 생성
		List<String> list1 = new ArrayList<String>(); // 문자열을 넣어라 (클래스 만들 필요 x)

		// LinkedList컬레션 객체 생성
		List<String> list2 = new LinkedList<String>();

		// 시작 시간과 끝 시간을 저장할 변수 선언
		long startTime;
		long endTime;

		// ArrayList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			list1.add(0, String.valueOf(i)); // List안에 <>타입이 String이어서 vlaueOf(i)를 씀 -> i값을 String으로 바꿔줘라
		}

		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (endTime - startTime) + "ns");

		// LinkedList컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			list2.add(0, String.valueOf(i));
		}

		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : " + (endTime - startTime) + "ns");

	}

}
