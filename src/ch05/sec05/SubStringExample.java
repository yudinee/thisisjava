package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {

		
        String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);   //substring() 문자열을 잘라내어 가져오고 싶을 때 사용
		System.out.println(firstNum);           // 0 부터 6 앞 까지 가져와라(6글자)
		
		String secondNum = ssn.substring(7);    // 7부터 가져와라
  		System.out.println(secondNum);
  		
  		String a = "970228-2065619";
  		
  		
  		
	}

}
