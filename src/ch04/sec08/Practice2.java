package ch04.sec08;

public class Practice2 {

	public static void main(String[] args) {

		
		//138p  q.5
				int i ;
				int j;
				for(i = 1; i <=10; i++) {
					for(j=1; j <=10; j++) {
						if(4*i + 5*j == 60) {
							System.out.println("(" + i +"," + j + ")");
						}
					}
				}
				
			System.out.println("-------------------------");
				//q.4
				
				
				int num1 = 0;
				int num2 = 0;
				while(num1 + num2 != 5) {
					num1 = (int)(Math.random()*6)+1;
					num2 = (int)(Math.random()*6)+1;
					System.out.println("(" +num1 + "," + num2 + ")" );
				}
				System.out.println("-----------------------");
	
				
				
	}

}
