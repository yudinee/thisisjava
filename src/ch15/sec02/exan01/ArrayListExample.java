package ch15.sec02.exan01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		// Array컬렉션 생성
		List<Board> list = new ArrayList<>(); // Board -> 클래스 //타입 list ->Board클래스의 필드 값 들어 감

		// 객체 추가
		// Board board = new Board(제목, 내용, 글쓴이) -> 원래 객체 생성 방법
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));

		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();

		// 특정 인덱스의 객체 가져오기
		Board board = list.get(2); // 처음 컬렉션 생성할 때 list에 Board클래스 타입을 넣어줘서 Board타입을 씀 //get()는 인덱스 0번 부터 시작
		System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());

		System.out.println();
		// 모든 객체 하나씩 가져오기
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}

		System.out.println();

		// 객체 삭제
		list.remove(2); // 2번 인덱스를 삭제하면 3번 인덱스가 2번 인덱스로 변경되므로 다시 2번 인덱스를 제거할 수 있음
		list.remove(2);

		// list.clear(); -> 저장된 객체를 모두 삭제

		// 향상된 for문으로 모든 객체를 하나씩 가져오기
		for (Board b : list) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
		
		
		
	}

}
