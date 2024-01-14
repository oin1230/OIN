package OOP기초;

public class PersonMain {
	// 실행할 수 있는 공간
	
	public static void main(String[] args) {
		
		// 1. 설계도르 기반으로 객체를 생성
		// 자료형 변수명 = new 자료형();
		// 사람자료형을 만듈기! 변수명은 person
		Person person = new Person();
		System.out.println(person);
		System.out.println(person.name);
		System.out.println(person.age);
		// field에 아무것도 넣어주지 않았을때는 기본값을 세팅된다.
		// String --> null
		// int --> 0
		person.name = "오인영";
		System.out.println(person.name);
		
		person.age = 31;
		person.gender = "남";
		System.out.println(person.age);
		System.out.println(person.gender);
		
		// 하나의 클래스로 여러개의 객체 생성이 가능하다.
		// 여러분 짝궁의 정보를 정보를 저장하는
		// person2 객체를 생성
		
		Person person2 = new Person();
		

		person2.name = "조범수";
		person2.age = 5;
		person2.gender = "신";
		
		System.out.println(person2.name);
		System.out.println(person2.age);
		System.out.println(person2.gender);
		
		person2.talk();
		
		
		
	}

}
