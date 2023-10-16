package ch12.sec09;

import java.text.DecimalFormat;

/*
 * format(형식) 클래스는 숫자 또는 날짜를 원하는 형태의 문자열로 변환해주는 기능을 제공한다.
 * 	DecimalFormat	->	숫자를 형식화된 문자열로 변환
 * 	SimpleDateFormat	->	날짜를 형식회된 문자열로 변환 
 * 
 * 	
 */
public class DecimalFormatExample {

	public static void main(String[] args) {
		//패턴 정보와 함께 DecimalFormat 객체를 생성히고 format() 메소드로 숫자를 제공하면 패턴에 따른 형식화된 문자열을 얻을 수 있다.
		
		double num = 1234567.89;
		
		DecimalFormat df;
		
		//정수 자리까지 표기
		df = new DecimalFormat("#,###");
		System.out.println(df.format(num));
		
		//무조건 소수 첫째 자리까지 표기 
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0,000000000000");
		System.out.println(df.format(num));
		
		
	}

}
