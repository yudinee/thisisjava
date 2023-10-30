package ch15.sec03.exan02;

public class Member {

	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// hashCode 재정의
	@Override // name과 age값이 같으면 동일한 hashCode가 리턴 됨
	public int hashCode() {
		return name.hashCode() + age;
	}

	// equals 재정의
	@Override // name과 age값이 같으면 true가 리턴 됨
	public boolean equals(Object obj) {
		if (obj instanceof Member target) {
			return target.name.equals(name) && (target.age == age);
		} else {
			return false;
		}
	}

}
