package ch04.sec04;

public class ForMultiplecationTableExample {

	public static void main(String[] args) {
		
		
		for (int i = 2; i <= 9; i++) {
			System.out.println("----" + i + "단----");
			for (int j = 1; j <= 9; j++) { // 위에 for문 2단에서 안에 있는 for문이 다 돌아가고 밖에있는 for문, 다음 3단,4단...반복
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
		
		
	}

}
