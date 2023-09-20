package ch05.sec08;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {

		// new String을 하면 번지수가 달라짐
		
				String [] strArray = new String[3];
				strArray[0] = "java";
				strArray[1] = "java";
				strArray[2] = new String ("java");
				
				System.out.println(strArray[0] == strArray[1]);   //같은 객체 참조
				System.out.println(strArray[0] == strArray[2]);   //다른 객체 참조
				System.out.println(strArray[0].equals(strArray[2]));  //문자열 동일
				
			
			
	}

}
