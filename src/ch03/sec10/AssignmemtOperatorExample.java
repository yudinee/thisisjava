package ch03.sec10;

public class AssignmemtOperatorExample {

	public static void main(String[] args) {

		int result = 0;
		result = result + 10;
		System.out.println(result); // -> 이걸 풀어서 += 10 하면 값이 같음 (밑에 예시)
		
		int result1 = 0;
		result1 += 10;    // result = result +10
		System.out.println("resut1 = " + result1);
		
		result1 -= 5;    // result = result -5
		System.out.println("resut1 = " + result1);
		
		result1 *= 3;    //result = result *3
		System.out.println("resut1 = " + result1);
		
		result1 /= 5;    //result = result /5
		System.out.println("resut1 = " + result1);
		
		result1 %= 3;    // 3/3 = 1 이것 나눈 값의 몫 나머지는 0
		System.out.println("resut1 = " + result1);
		
	}

}
