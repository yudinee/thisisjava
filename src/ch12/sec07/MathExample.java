package ch12.sec07;
/*
 * 절대값
 * 	abs (-5 -> 5, -3.14 -> 3.14)
 * 올림값 
 * 	ceil (5.3 -> 6.0, -5.3 -> -5.0)
 * 버림값
 * 	floor (5.3 -> 5.0, -5.3 -> -6.0)
 * 최대값
 * 	max
 * 최소값
 * 	min
 * 랜덤값
 * 	Math.random()
 * 반올림값
 * 	Math.round (5.3 -> 5, 5.7 -> 6)
 */
public class MathExample {

	public static void main(String[] args) {
		//Math클래스
		//Math클래스가 제공하는 메소드는 모두 정적(static)이므로 Math클래스로 바로 사용이 가능하다.
		
		// 큰 정수 또는 작은 정수 얻기

		double vi = Math.ceil(5.3);  
		double v2 = Math.floor(5.3);  
		System.out.println("v1 : " + vi);
		System.out.println("v2 : " + v2);

		// 큰 값 또는 작은 값 얻기
		long v3 = Math.max(3, 7);
		long v4 = Math.min(3, 7);
		System.out.println("v3 : " + v3);
		System.out.println("v4 : " + v4);

		// 소수 이하 두 자리 얻기
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double v5 = temp2 / 100.0;
		System.out.println("v5= " + v5);
		
	}

}
