package ch09.sec06.exam03;

public class Button {

	// 중첩 인터페이스
	// 클래스의 멤버로 선언된 인터페이스
	// A객체 없이 B인터페이스를 사용할 수 있도록 하기 위해 static을 추가할 수 있다.

	
	
	// 정적멤버 인터페이스
	public static interface ClickListener {
		// 추상메소드
		void onClick();
	} // 인터페이스 끝

	// 필드
	private ClickListener clickListener;

	// 메소드
	public void setClickListener(ClickListener clickListener) { // (인터페이스 타입, 매개변수)
		this.clickListener = clickListener;
	}

	public void click() {
		this.clickListener.onClick(); // 11번 줄의 OnClick
	}
}
