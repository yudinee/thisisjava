package ch13.sec02.exam01;

public class GenericExample {

	public static void main(String[] args) {

		// K는 Tv로 대체, M은 String 으로 대체
		Product<Tv, String> product1 = new Product<>();

		// setter 매개값은 반드시 Tv와 String 제공 //제네릭에서는 반드시 setter먼저 (setter로 값을 세팅 한 후
		// getter)
		product1.setKind(new Tv()); // Tv타입(Tv라는 객체 만들어서 setKind에 넣기)
		product1.setModel("스마트Tv"); // String 타입

		// Getter 리턴값은 Tv와 String이 됨
		Tv tv = product1.getKind(); // Tv클래스 타입 리턴
		String tvmodel = product1.getModel(); // String타입 (model필드 값 리턴)

		System.out.println(tvmodel);

		// K는 Car로 대체, M은 String으로 대체
		Product<Car, String> product2 = new Product<>();

		// Setter 매개값은 반드시 Car와 String제공
		product2.setKind(new Car()); // Car타입(Car라는 객체 만들어서 setCar에 넣기)
		product2.setModel("SUV자동차"); // String 타입

		// Getter 리턴값은 Car와 String이 됨
		Car car = product2.getKind(); // Car클래스 타입 리턴
		String carModel = product2.getModel(); // String타입 (model필드 값 리턴)

		System.out.println(carModel);
	}

}
