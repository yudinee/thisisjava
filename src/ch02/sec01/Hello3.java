package ch02.sec01;

public class Hello3 {

	public static void main(String[] args) {

		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분" );
		
		int totalMinute = (hour*60) + minute;
		System.out.println(totalMinute + "분");
		

		
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + " y:" + y );
		
		int temp = x;
		x = y;  //앞에 int쓰지 않는 이유는 위에 int로 선언해놨기 때문                              
		y = temp;
		System.out.println("x:" + x + " y:" +y);


		
		int a = 2;
		int b = 2;
		int result = a*b;
		System.out.println(result);
		System.out.println(a + "*"+ b + "="+ result);
		
		int yy = 3;
		int result1 = a *yy;
		System.out.println(a + " * "+ yy + " = "+ result1);
		
		

	}

}
