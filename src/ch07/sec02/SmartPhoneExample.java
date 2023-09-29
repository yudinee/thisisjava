package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		//SmartPhone의 객체 생성 
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		//Phone 으로부터 상속받은 필드 읽기 
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
		
		//SmartPhone의 필드 읽기
		System.out.println("와이파이상태 : " + myPhone.wifi);  //값이 false인 wifi부른 것 
		
		//Phone으로부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요! 저는 홍실동인데요.");
		myPhone.sendVoice("아~ 네. 반갑습니다.");
		myPhone.hangUp();
		
		//SmartPhone의 메소드 호출 
		myPhone.setWifi(true);  //값을 넣은 setWifi를 부른 것 
		myPhone.internet();
	}

}
