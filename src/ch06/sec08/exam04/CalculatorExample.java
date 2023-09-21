package ch06.sec08.exam04;

public class CalculatorExample {
	public static void main(String[] args) {
		
		//객체 생성 
		Calculator myCalcu = new Calculator ();
		
		//정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);   //double은 int를 포함하고 있어서 정수로 넣어도 됨
		                                              //areRectangle(double width)실행
		//직사각형이 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20); //areaRectangle(double width, double height)실행
		
		System.out.println("result1 : " + result1);
		System.out.println("resut2 : " + result2);
	}

}
