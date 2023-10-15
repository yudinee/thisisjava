package ch12.sec05;

import java.util.StringTokenizer;
/*
 * 리턴타입		메소드(매개변수)		설명
 * int			countTokens()		분리할 수 있는 문자열의 총 수
 * boolean		hasMoreTokesns()	남아 있는 문자열이 있는지 여부
 * String		nestToken()			문자열을 하나씩 가져 옴 
 * 
 */
public class StringTokenizerExample {

	public static void main(String[] args) {

		// 문자열을 분리하려면 String의 split() 메소드를 이용하거나 StringTokenizer클래스를 이용할 수 있다.

		String data1 = "홍길동&이수홍,박연수";
		String[] arr = data1.split("&|,");
		for (String token : arr) {
			System.out.println(token);
		}

		System.out.println();

		String data2 = "홍길동,이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, ",|/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
