package ch09.sec06.exam03;


public class ButtonExample {

	public static void main(String[] args) {
		
		// ok 버튼 객체 생성
		Button btnOk = new Button();

		// Ok버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬클래스)
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		}

		// Ok버튼 객체에 ClickListener구현 객체 주입
		btnOk.setClickListener(new OkListener()); // 매개변수(clickListener 타입(OkListener가 ClickListener상속)

		// Ok버튼 클릭하기
		btnOk.click();

		// cancel 버튼 객체 생성
		Button btnCancel = new Button();

		// Cancel 버큰 클릭 이벤트 처리할 ClickListener 구현 클래스(로컬 클래스)
		class CancelListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancle 버튼을 클릭했습니다.");
			}
		}

		// Cancel 버튼 객체에 ClickListener 구현 객체 주입
		btnCancel.setClickListener(new CancelListener());

		// Cancel 버튼 클릭하기
		btnCancel.click();

		// 내가 만든 것
		Button btnPlay = new Button();

		class PlayListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("play 버튼을 클릭했습니다.");
			}
		}

		btnPlay.setClickListener(new PlayListener());
		btnPlay.click();
	}

}
