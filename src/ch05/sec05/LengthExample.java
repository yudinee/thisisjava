package ch05.sec05;

public class LengthExample {

	public static void main(String[] args) {
	String ssn = "9506241230123";
	int length = ssn.length();    // length() 는 길이 물어보는 변수 charAt()는 중간에 있는 문자 가져올 때
	
	if(length==13) {
		System.out.println("주민등록번호 자릿수가 맞습니다.");
	} else {
		System.out.println("주민등록번호 자릿수가 틀립니다. ");
	}
	
	
		

	}

}
