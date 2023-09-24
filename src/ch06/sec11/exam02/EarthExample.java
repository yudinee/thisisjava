package ch06.sec11.exam02;

public class EarthExample {
	public static void main(String[] args) {
		
		//상수 읽기  
		//static으로 만들었기 때문에 객체생성(생성자)해줄필요 없다.
		System.out.println("지구 반지름 : " + Earth.EARTH_RADIUS);
		System.out.println("지구의 표면적 : " + Earth.EARTH_SURFACE_AREA);
	}

}
