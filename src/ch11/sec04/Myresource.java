package ch11.sec04;

public class Myresource implements AutoCloseable{ //리소스 자동닫기 위해 AutoCloseable 인터페이스 구현 
	//리소스 자동닫기
	//try-with-resource블록을 사용하면 예외 발생 여부 상관없이 리소스를 자동으로 닫아준다.
	//try-with-resource블록을 사용하기 위해서는 AutoCloseable() 인터페이스의 close()메소드를 재정의 해야한다.
	
	
	private String name;
	
	public Myresource (String name) {
		this.name = name;
		System.out.println("[Myresource(" + name + ") 열기]");
	}
	
	public String read1() {
		System.out.println("[Myresource(" + name + ") 읽기]");
		return "100";  //read1의 값 
	}
	
	public String read2() {
		System.out.println("[Myresource(" + name + ") 읽기]");
		return "abc";   //read2의 값 
	}
	
	@Override //close재정의 (AutoCloseable이 close를 가지고 있음
	public void close() throws Exception {
		System.out.println("[Myresource(" + name + ") 닫기]");  //예외발생여부 상관없이 자동 닫기 
	}
	
	
}
