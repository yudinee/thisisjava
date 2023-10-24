package ch13.sec02.exam01;
/*
 * 제네릭 타입
 * 	제네릭 타입은 결정되지 않은 타입을 파라미터로 가지는 클래스와 인터페이스를 말한다.
 * 	외부에서 제네릭 타입을 사용하려면 타입 파라미터에 구체적인 타입을 지정해야 한다. 만약 지정하지 않으면 object타입이 암묵적으로 사용된다.
 * 	
 */
public class Product <K,M>{  //타입 파리미터로 K와 M 정의
	//필드
	private K kind;      //타입 파라미터를 필드 타입으로 사용
	private M model;
	
	//메소드
	public K getKind() {return this.kind;}    //타입 파리미터를 리턴타입과 매개변수 타입으로 사용
	public M getModel() {return this.model;}
	public void setKind(K kind) {this.kind = kind;}
	public void setModel(M model) {this.model = model;}

	
	

}
