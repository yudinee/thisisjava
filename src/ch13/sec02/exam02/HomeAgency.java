package ch13.sec02.exam02;

public class HomeAgency implements Runtable<Home>{//타입 파라미터 P를 Home으로 대체 
	
	@Override
	public Home rent() {
		return new Home();   //리턴타입이 반드시 Home이어야 함
	}
	

}
