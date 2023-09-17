package ch03.sec01;

public class SignOperatorExample {

	public static void main(String[] args) {

		
		// +는 부호 유지
				// -는 부호 변경
				int x = -100;
				x = -x;
				System.out.println("x : " + x);
				
				byte b = 100;
				int y = -b;      // byte, short, int 연산의 결과는 int타입으로 해야함
				System.out.println("y : " + y);
				
				
				 /*  ++i,--i  변수에 1증가 또는 감소 시킨 후 다른 연산을 수행
				     i++,i--  모든 연산을 끝낸 후에 변수를 1증가 또는 1감소 시킨다.
				     	int x = 1;
				     	int y = 1;
				     	int result1 = ++x +10;  -> x를 1 증가 후 +10 즉 12
				     	int result2 = y++ +10;  -> 기존 y인 1과 10을 더함 result는 11 그후 y에 1 증가 y는 2  */
				
				int c = 10;
				int d = 10;
				int e;
				
				System.out.println("---------------------------------");
				
				
				c++;  // 11   뒤에 또 다른 연산이 없고 하나일때는 바로 +해줌
				++c;  //12  
				System.out.println("c = " + c);
				
				System.out.println("-------------------------------");
				
				d--;
				--d;     //뒤에 또 다른 연산이 없고 하나일때는 바로 -해줌
				System.out.println("d = " + d);
				
				System.out.println("-------------------------------------");
				
				e = c++;    //e는 12 ++이 뒤에 들어갔기 때문에 e는 12
				System.out.println("e = " + e);
				System.out.println("c = " + c);
				
				System.out.println("----------------------------------------");
				
				e = ++c;
				System.out.println("e = " + e);
				System.out.println("c = " + c);
				
				System.out.println("----------------------------------");
				
				e = ++c + d++;       // d는 d++이므로 더해줄 때는 +1 하지 않은 채로 더 하고 나중에 d에만 +1 (15+8)
				System.out.println("e = " + e);
				System.out.println("c = " + c);
				System.out.println("d = " + d);
				
	}

}
