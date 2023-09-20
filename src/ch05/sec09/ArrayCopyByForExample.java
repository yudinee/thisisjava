package ch05.sec09;

public class ArrayCopyByForExample {

	public static void main(String[] args) {

		
		//배열 복사
		
				//길이 3인 배열
				int[] oldArray = {1,2,3};
				//길이 5인 배열
				int[] newArray = new int[5];
				//배열 항목 복사
				for(int i=0; i<oldArray.length; i++) {
					newArray[i] = oldArray[i];
				}
				//배열 항목 출력
				for(int i=0; i<newArray.length; i++) {
					System.out.print(newArray[i] + ", ");
				}
				
				
				
	}

}
