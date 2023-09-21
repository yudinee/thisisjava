package ch06.sec07.exam04;

public class CarExample {
	public static void main(String[] args) {
		
		Car car = new Car();                                    //생성자1호출 
		System.out.println("car.company : " +car.company);
		System.out.println();
		
		Car car2 = new Car("자가용");                           //생성자2호출 
		System.out.println("car2.company : " +car2.company);
		System.out.println("car2.model : " + car2.model);      //선언클래스 Car에 있는 this.modle이 호출
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");                     //생성자3호출 
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200);                  //생서자4호출 
		System.out.println("car4.compant : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}

}
