package ch05.sec03;

public class ReferenceVariableExample {

	public static void main(String[] args) {

		
		//배열은 참조타입 참조타입은 데이터값이 아닌 주소값을 가지고 있음
				//데이터가 같다고 주소가 같지는 않음
				int[]arr1;    //[]는 값을 여러개 넣을 수 있는 배열
				int[]arr2;
				int[]arr3;
				
				arr1 =  new int[] {1,2,3}; //heap영역에 주소값 저장
				arr2 =  new int[] {1,2,3}; //heap영역에 주소값 저장
				arr3 = arr2;
				
				System.out.println(arr1 == arr2); //데이터값은 같지만 주소값은 다름
				System.out.println(arr2 == arr3); //주소값 같음
				
				System.out.println(arr3);
				
				
				int[] arr4 = new int[] {1,2,3};  //위 처럼 띠로 안 하고 한 번에 할 수도 있음 
				
	}

}
