package ch13.sec02.exam02;

public interface Runtable<P> { // 타입 파라미터 P 정의
	
	P rent(); // 타입 파라미터 P를 리턴타입으로 사용
	// P앞에 접근제한자 생략 (default타입)

}
