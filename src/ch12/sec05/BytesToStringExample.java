package ch12.sec05;

import java.util.Arrays;

/*
 * String 클래스 
 * 	String 클래스는 문자열을 저장하고 조작할 때 사용한다. 문자열 리터럴은 자동으로 String 객체로 생성되지만
	String 클래스의 다양한 생성자를 이용해서 직접 객체를 생성할 수도 있다.
	프롤그램을 개발하다 보면 byte 배열을 문자열로 변환하는 경우가 종종있다.
 * 
 */
public class BytesToStringExample {

	public static void main(String[] args) throws Exception {
		//다음 예제는 문자열을 byte로 변환시키고 다시 문자열로 복원하는 방법을 보여준다.
		String data = "자바";

		// String -> byte배열(기본 : UTF-8 인코딩)
		byte[] arr1 = data.getBytes();  //자바를 byte 타입으로 쪼개서 arr1에 넣음 
		System.out.println("arr1 :" + Arrays.toString(arr1));

		// byte배열 -> String(기본 : UTF-8 인코딩)
		String str1 = new String(arr1);  //byte 배열을 다시 문자열로 
		System.out.println("str1: " + str1);

		// String -> byte배열(EUC-KR 인코딩)
		byte[] arr2 = data.getBytes("EUC-KR");
		System.out.println("arr2: " + Arrays.toString(arr2));

		// byte배열 ->String(기본: UTF-8인코딩)
		String str2 = new String(arr2, "EUC-KR");
		System.out.println("str2: " + str2);

	}

}
