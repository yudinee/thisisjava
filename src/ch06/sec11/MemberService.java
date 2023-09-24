package ch06.sec11;

public class MemberService {
	
	//q. 15
		String id = "hong";
		String password = "12345";

		public boolean login(String id, String password) {
			if (this.id.equals(id) && this.password.equals(password)) {
				return true;
			} else {
				return false;
			}
		}

		public void logout(String id) {
			if (this.id == id) {

				System.out.println(id + "님이 로그아웃 되었습니다.");
			}
		}

	
	}
	
	

