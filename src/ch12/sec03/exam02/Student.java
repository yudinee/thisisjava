package ch12.sec03.exam02;
/*
 * 객체 해시코드
 * 	객체 해시코드란 객체를 식별하는 정수를 말한다.  
 * 	Object의 hashCode() 메소드는 객체의 메모리 번지를 이용해서 해시코드를 생성하기 때문에 객체마다 다른 정수값을 리턴한다.
 * 	hashCode()메소드의 용도는 equals 메소드와 비슷한데, 두 객체가 동등한지를 비교할 때 주로 사용한다.
 * 
 * 	equals()메소드와 마찬가지로 hashCode()메소드 역시 객체의 데이터를 기준으로 재정의해서 새로운 정수값을 리턴하도록하는게 일반적이다.
 * 	객체가 다르다 할자라도 내부 데이터가 동일하다면 같은 정수값을 리턴하기 위헤서다.
 * 
 * 	우선 hashCode()가 리턴하는 정수값이 같은지를 확인하고, 그 다음 equals()메소드가 true를 리턴하는지를 확인해서 동등 객체임을 판단한다.
 */
public class Student {

	// Student 객체를 동등비교하기 위해 hashCode()와 equals()메소드를 재정의했다.
	// 학생 번호와 이름으로 해시코드를 생성하고, 학생 번호와 이름이 동일할 경우에만 equals()가 true를 리턴하도록 했다.

	private int no;
	private String name;

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	@Override // Object의 hashCode() 메소드를 재정의해서 학생 번호와 이름 해시코드를 합한 새로운 해시코드를 리턴하도록 함
	public int hashCode() { // (번호와 이름이 같으면 동일한 해시코드가 생성됨)
		int hashCode = no + name.hashCode(); // hashCode()는 정수값이어서 no와 name이 + 가 가능함
		return hashCode;
	}

	@Override // Object의 equals() 메소드를 재정의해서 Student객체인지를 확인하고, 학생 번호와 이름이 같으면 true를 리턴하도록 함
	public boolean equals(Object obj) {
		if (obj instanceof Student target) { // obj랑 target이랑 타입이 같은지
			if (no == target.getNo() && name.equals(target.getName())) { // student 클래스의 no, student클래스의 name
				return true;
			}
		}
		return false;
	}
}