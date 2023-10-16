package ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {

	public static void main(String[] args) {
		//Calendar클래스의ㅣ 오버로딩된 다른 getInstance()메소드를 이용하면 미국/ 로스앤젤레스와 같은
		//다른 시간대의 Calendar를 얻을 수 있다. 
		//얻고 싶은 시간대의 TimeZone 객체를 얻어, getInstance()메소드의 매개값으로 넘겨주면 된다.
		
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(timeZone);
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초");
		
		
	}

}
