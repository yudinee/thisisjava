package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
 * LoclaDateTime클래스는 날짜와 시간을 비교할 수 있는 다음 메소드도 제공한다.
 * 리턴타입		메소드(매개변수)		설명
 * boolean		isAfter(other)		이후 날짜인가?
 * boolean 		isBefore(other)		이전 날짜인가?
 * boolean 		isEqual(other)		동일 날짜인가?
 * long			until(other,unit)	주어진 단위(unit) 차이를 리턴
 * 
 */
public class DateTimeCampareExample {

	public static void main(String[] args) {

		//다음 예제는 2021년 1월 1일과 2021년 12월 31일을 비교한다.
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
		System.out.println("시작일 : " + startDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0);
		System.out.println("종료일 : " + endDateTime);
		
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("진행중입니다.");
		} else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("종료합니다.");
		} else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("종료했습니다.");
		}
		
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("남은 해 : " + remainYear);
		System.out.println("남은 월 : " + remainMonth);
		System.out.println("남은 일 : " + remainDay);
		System.out.println("남은 시간 : " + remainHour);
		System.out.println("남은 분 : " + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
	}

}
