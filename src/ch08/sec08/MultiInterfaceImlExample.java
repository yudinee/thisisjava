package ch08.sec08;

public class MultiInterfaceImlExample {

	public static void main(String[] args) {

		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		
		Searchable sc = new SmartTelevision();
		sc.search("https://www.ypuyube.com");
	}

}
