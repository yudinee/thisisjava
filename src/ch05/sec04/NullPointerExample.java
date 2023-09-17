package ch05.sec04;

public class NullPointerExample {

	public static void main(String[] args) {

		
		int [] intArray = null; //주소값x
		// intArray = 10;       //주소값이 없어서 데이터 저장 불가능
		
		String str = null;      //주소값x
		//System.out.println("총 문자 수 : " + str.length()); // NullPointException
		
		
		String hobby = "여행";  //heap영역에 주소값 생김   
		hobby = null;          //주소값이 없어짐
		System.out.println(hobby);
		
		
		//참조타입은 heap영역에 데이터가 생김
        //기본타입은 stack영역에 데이터 생김 
       //(참조타입은 stack영역에 주소값을 저장하지만 실질적인 데이터는 heap에 생김)
		
		String kind1 = "자동차";
		String kind2 = kind1;    
		kind1 = null;        
		System.out.println("kind2 : " +kind2);
		System.out.println("kind1 : " +kind1);
		
		
		
		
	}

}
