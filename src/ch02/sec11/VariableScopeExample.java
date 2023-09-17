package ch02.sec11;

public class VariableScopeExample {
	public static void main(String[] args) {
		
		//if문에 참일때만 출력하고 싶은 경우 else없이도 사용 가능
				int v1 = 15;
				if(v1 > 10) {
					int v2 = v1 - 10;	
				}
				//int v3 = v1 + v2 + 5; -> v2변수를 사용할 수 없기때문에 컴파일 에러
				
				int v3 = v1  + 5;
				
				
				//if문 안에서 선언한 변수는 if문 안에서만 사용가능 
				
			
				
	}
}
