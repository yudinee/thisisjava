package ch07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {
		//객체생성 및 자동타입변환
		Parent parent = new Child();
		
		//Parent 타입으로 필드로 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 * parent.field2 = data2;
		 * parent.method3();
		 * 자동타입변환으로는 실행 불가능 
		 */
		
		//강제타입변환
		Child child = (Child) parent;
		
		//Child타입으로 필드와 메소드 사용
		child.field2 = "data2";
		child.method3();
		System.out.println(child.field2);

	}

}
