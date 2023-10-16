package ch12.sec08;

import java.util.Calendar;

/*
 * Calendar클래스
 * 	Calendar클래스는 달력을 표현하는 추상 클래스이다.
 * 	정적메소드인 getInstance() 메소드를 이용하면 컴퓨터에 설정도어 있는 시간대를 기준으로 Calendar하위 객체를 얻을 수 있다.
 * 	Calendar가 제공하는 날짜와 시간을 얻기 위해서는 get()메소드를 이용해야 한다.
 * 
 * int year = now.get(Calendar.YEAR);  // 년도를 리턴
 * int month = now.get(Calendar.MONTH) + 1;  //월을 리턴 (month는 +1을 해줌)
 * int day = now.get(Calendar.DAY_OF_MONTH);  //일을 리턴
 * int week = now.get(Calendar.DAY_OF_WEEK);  //요일을 리턴
 * int amPm = now.get(Calendar.AM_PM);  //오전/오후를 리턴
 * int hour = now.get(Calendar.HOUR);  //시를 리턴
 * int minute = now.get(Calendar.MINUTE);  //분을 리턴
 * int second = now.get(Calendar.SECOND);  //초를 리턴 
 * 
 */
public class CalendarExample {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) +1;//월은 +1해줌 
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:		strWeek = "월";  break;
		case Calendar.TUESDAY:		strWeek = "화";  break;
		case Calendar.WEDNESDAY:	strWeek = "수";  break;
		case Calendar.THURSDAY:		strWeek = "목";  break;
		case Calendar.FRIDAY:		strWeek = "금";  break;
		case Calendar.SATURDAY:		strWeek = "토";  break;
		default:	strWeek = "일";
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second +"초 ");
	}

}
