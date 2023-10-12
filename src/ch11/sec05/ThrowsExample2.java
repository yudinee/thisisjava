package ch11.sec05;

public class ThrowsExample2 {

	public static void main(String[] args) throws Exception {  //메인메소드에 예외처리 넘김 
		findClass();
		
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class.forName("java.lang.String2");
	}

}
