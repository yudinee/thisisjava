package ch05.sec09;

public class ArrayCapyExample {

	public static void main(String[] args) {

		
		         //배열 복사 
				//System.arraycopy(arr1 , 0 , arr2, 0, arr1.length);
				
				//길이 3인 배열
				String[] oldArray = {"java", "array", "copy"};  //원본 배열
				//길이 5인 배열을 새로생성
				String[] newArray = new String[5];    //초기값 null
				//배열 항목 복사
				System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
				//배열 항목 출력
				for(int i=0; i<newArray.length; i++) {
					System.out.print(newArray[i] + ", "); 
				}
				
				
				
				
	}

}
