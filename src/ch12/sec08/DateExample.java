package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * date클래스
 *	Date는 날짜를 표현하는 클래스로 객에 간에 날짜 정보를 주고 받을 때 사용된다. 
 *	Date() 생성자는 컴퓨터의 현재 날짜를 읽어 Date 객체로 만든다.
 *	
 *	현재 날짜를 문자열로 얻고 싶다면 toString()메소드를 사용할 수 있지만 영문으로 출력되기때문에 우리가 원하는 형식이 아니다.
 *	원하는 문자열로 얻고 싶다면 SimpleDateFormat클래스와 함께 사용해야 한다. 
 * 
 */
public class DateExample {

	public static void main(String[] args) {

		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy. MM. dd HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		
		
	}

}
