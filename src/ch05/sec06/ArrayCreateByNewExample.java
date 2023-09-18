package ch05.sec06;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {

		
		//new 타입[]; 배열에 저장할 수 있는 항목의 수 
				int[] arr1 = new int[3]; // 배열이3개 담길 수 있는 객체 생성 
				
				for(int i=0; i<3; i++) { //값을 입력하기 않은 배열의 초기값
					System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
				}
				
				System.out.println();
				arr1[0] = 10;   //배열에 값 입력
				arr1[1] = 20;
				arr1[2] = 30;
				
				for(int i=0; i<3; i++) { //값 입력된 배열
					System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
				}
				System.out.println("\n"); //줄 바꿈
				
				
				
				double[] arr2 = new double[3];
				
				for(int i=0; i<3; i++) {
					System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
				}
				
				System.out.println();
				
				arr2[0] = 0.1;   
				arr2[1] = 0.2;
				arr2[2] = 0.3;
				
				for(int i=0; i<3; i++) { 
					System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
				}
				
				System.out.println("\n");
				
				
				
				String[] arr3 = new String[3];
				
				for(int i=0; i<3; i++) { 
					System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
				}
				
				System.out.println();
				
				arr3[0] = "1월";   
				arr3[1] = "2월";
				arr3[2] = "3월";
				
				for(int i=0; i<3; i++) { 
					System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
				}
				
				
	}

}
