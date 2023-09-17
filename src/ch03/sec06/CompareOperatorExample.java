package ch03.sec06;

public class CompareOperatorExample {
	public static void main(String[] args) {
		

		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		
		char char1 = 'A';
	    char char2 = 'B';
	    boolean result4 = (char1 < char2);  //65 < 66
	    System.out.println("result4 : " + result4);
	    
	    int num3 = 1;
	    double num4 = 1.0;
	    boolean result5 = (num3 == num4);
	    System.out.println("reuslt5 : " + result5);
	    
	    float num5 = 0.1F;
	    double num6 = 0.1;       
	    boolean result6 = (num5 == num6);    //float이 long보다 더 정밀하기 때문에 0.100...이 아닐 수도 있음 (원래 결과값은 false인데 내 노트북이 이상하게 나옴)
	    boolean result7 = (num5 == (float)num6);
	    System.out.println("reuslt6 : " + result5);
	    System.out.println("reuslt7 : " + result5);
	    
	    String str1 = "자바";
	    String str2 = "Java";
	    boolean result8 = (str1.equals(str2));
	    boolean result9 = (! str1.equals(str2));
	    System.out.println("reuslt8 : " + result8);
	    System.out.println("reuslt9 : " + result9);
	    
	   
		
	}

}
