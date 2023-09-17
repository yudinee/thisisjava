package ch02.sec05;

public class BooleanExample {

	public static void main(String[] args) {


		int x = 10;
		boolean result = (x == 20); // == 는 똑같냐는 뜻
		boolean result2 = (x != 20); // =!는 같지 않다는 뜻
		boolean result3 = (x > 20);
		boolean result4 = (0 < x && x < 20); // 변수x의 값이 0보다 크고, 20보다 작은가?
		boolean result5 = (x < 0 || x > 200);// 변수 x의 값이 0보다 적거나 200보다 큰가?
		
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		

		
		
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		} // stop의 값 중 true인 것이 출력, 조건이 참이면 if밑에 있는 것이 실행 거짓이면 else밑에 있는 것이 실행
		
		
		boolean stop1 = false;
		if(stop1) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		} // stop의 값 중 false인 것이 출력
		
		
		int a = 5;
		if(a==5) {
			System.out.println("중지합니다람쥐");
		}else {
			System.out.println("시작합니다.");
		} // 조건이 참이면 if밑에 있는 것이 실행 거짓이면 else밑에 있는 것이 실행, if를 사용하면 대답이 true인지 false인지 나오게 써야함
		
		
		boolean left = true;
		if(left) {
			System.out.println("왼쪽");
		}else {
			System.out.println("오른쪽");
		}
		
		

		

	}

}
