package ch06.sec11;

public class MemberServiceExample {
	public static void main(String[] args) {

		// q.15
		MemberService memberService = new MemberService();

		boolean result = memberService.login("hong", "12345");
		// hong, 12345가 같아서 result 값이 true가 들어감

		if (result) {
			System.out.println("로그인되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다. ");
		}

	}

}
