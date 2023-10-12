package ch12.sec03.exam01;
/*
 * Object클래스
 * 	클래스 선언할 때 extends키워드로 다른 클래스를 상속하지 않으면 암시적으로 java.lang.Object클래스를 상속하게 된다. 
 * 	따라서 자바의 모든 클래스는 Object의 자식이거나 자손클래스이다.
 * 
 * equals()메소드의 매개변수 타입이 Object이므로 자동 타입변환에 의해 모든 객체개 매개값으로 대입될 수 있다.
 * 	equals()메소드는 비교연산자인 ==과 동일한 결과를 리턴한다. 
 * 	두 객체가 동일한 객체라면 true를 리턴하고, 그렇지 않으면 false를 리턴한다.
 * 
 */
public class Member {
	
	//다음예제는 Member 객체의 동등비교를 위해 equals()메소드를 재정의한다.
	//Member타입이면서 id 필드 값이 같을 경우는 true를 리턴하고 
	//그 외의 모든 경우는 false를 리턴한다.

	
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override  //Object의 equals메소드 재정의 
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {  //obj가 Member타입인지 검사하고(intstanceof) member객체로 타입변환 후 target변수에 대입 
			if(id.equals(target.id)) {   //내가 가지고 있는 id와 타겟이 가지고 있는 id문자열이 같은지 비교 
				return true;  //문자열이 같다면 
			}
		}
		
		return false;  //같지 않다면 
	}
}
