package ch02.sec13;

public class Practice {

	public static void main(String[] args) {

		
		int v1 = 1;
		System.out.println("v1 : " + v1);
		if(true) {
			int v2 = 2;
			if(true) {
				int v3 = 2;
				System.out.println("v1 : " + v1);
				System.out.println("v2 : " + v2);
				System.out.println("v3 : " + v3);
			}
			
			System.out.println("v1 : " + v1);
			System.out.println("v1 : " + v2);
			//System.out.println("v3 : " + v3);  첫번째 if안에서는 v1, v2, v3모두 쓸 수 있지만 첫번째 if 가로가 닫힌 두번째 if는 v1,v2만 가능
			
		}
		
		System.out.println("v1 : " + v1);
		//System.out.println("v1 : " + v2); if안에 썼던 v2, v3는 if 밖에서는 사용 불가 
		
		
		
	}

}
