package ch13.sec02.exam02;

public class CarAgency implements Runtable<Car> {  //파라미터 P룰 Car로 대체
	
	@Override
	public Car rent() {
		return new Car();    //리턴타입이 반드시 Car여야 함
	}
	
}
