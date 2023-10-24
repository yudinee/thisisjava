package ch13.sec02.exam02;

public class GenericExample {

	public static void main(String[] args) {

HomeAgency homeAgency = new HomeAgency();
		
		//Home home = new Home();   //이것도 가능
		Home home = homeAgency.rent();  //rent()안에 new home있음
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		
		//Car car = new Car();     //이것도 가능
		Car car = carAgency.rent();
		car.run();
		
	}

}
