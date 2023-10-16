package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePerationExample {

	public static void main(String[] args) {
		//LocalDateTime클래스를 이용해서 션재 컴퓨터의 날짜와 시간을 얻는 방법은 다음과 같다.
		//LocalDateTime now = LocalDateTime.now();
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");  //새로운 방식
		System.out.println("현재시간 : " + now.format(dtf));
		
		LocalDateTime result1 = now.plusYears(1);
		System.out.println("1년 덧셈 : " + result1);
		
		LocalDateTime result2 = now.minusMonths(2);
		System.out.println("2월 뺄셈 : " + result2);
		
		LocalDateTime result3 = now.plusDays(7);
		System.out.println("7일 덧셈: " + result3);
		
		//13라인의 DateTimeFormatter는 날짜와 시간을 주어진 문자열 패턴으로 변환할 때 사용한다.
		//LocalDateTime의 format() 메소드는 호출 시 메개갑스로 제공하면 문자열 패턴과 동일한 문자열을 얻을 수 있다.
	}

}
