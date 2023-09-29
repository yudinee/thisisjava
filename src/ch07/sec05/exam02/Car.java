package ch07.sec05.exam02;
/*
 * final 클래스
 * 	클래스를 선언할 때 final키워드를 class앞에 붙이면 최종적인 클래스이므로 더이상 상속할 수 없는 클래스가 된다. 
 * 	즉, final클래스는 부모클래스가 될 수 없어 자식클래스를 만들 수 없다. 
 * 
 * final 메소드 
 * 	메소드를 선언할 때 final키워드를 붙이면 이 메소드는 최종적인 메소드이므로 오버라이딩할 수 없는 메소드가 된다. 
 * 즉, 부모 클래스에 선언된 final 메소드는 자식클래스에서 재정의할 수 없다. 
 */
public class Car {
	
	//필드 선언
	public int speed;
	
	//메소드 선언
	public void speedUp() {
		speed += 1;
	}
	
	//final메소드
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
	

}
