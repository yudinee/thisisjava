package ch06.sec11.exam02;

public class Earth {
	
	//불변의 값을 저장하는 필드를 상수라고 함
	//상수는 객체마다 저장할 필요가 없고, 여러 개의 값을 가져도 안되기 때문에 static 이면서 final이다. 
	//상수 이름은 모두 대문자, 서로 다른 단어가 혼합되면 언더바 _ 로 단어를 연결
	
	
	
	//상수 선언 및 초기화 
	final static double EARTH_RADIUS = 6400;
	
	//상수 선언 
	final static double EARTH_SURFACE_AREA;
	
	//정적 블록에서 상수 초기화 
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
	

}
