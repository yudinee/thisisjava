package ch15.sec05.exan03;

public class Person implements Comparable<Person>{
	
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	@Override // 오버라이딩 안하면 정렬순서 뒤죽박죽 나옴
	public int compareTo(Person o) { // 매개변수 하나 (내거 필드, 입력 필드)
		if (age < o.age)
			return -1;
		else if (age == o.age)
			return 0;
		else
			return 1;
		// return -> 순서를 매겨 줌
	}

}
