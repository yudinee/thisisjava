package ch16.sec02.exam02;

public class ButtonExample {

	public static void main(String[] args) {

		// Ok버튼 객체 생성

		Button btnOk = new Button();

		// Ok버튼 객체에 람다식(ClickListener 익명 구현 객체 ) 주입
		btnOk.setClickListener(() -> { // 매개값으로 람다식 대입

			System.out.println("Ok버튼을 클릭했습니다.");
		});

		// Ok버튼 클릭하기
		btnOk.click();

		// cancel 버튼 객체 생성
		Button btnCancel = new Button();

		// cancel 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
		btnCancel.setClickListener(() -> { // 매개값으로 람다식 대입
			System.out.println("Cancel버튼을 클릭했습니다.");
		});

		// cancel버튼 클릭하기
		btnCancel.click();
	}

}
