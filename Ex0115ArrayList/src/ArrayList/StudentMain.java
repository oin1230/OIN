package ArrayList;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {

		// 1. Student 자료형을 보관할 수 있는
		// sList 라는 이름을 가진 ArrayList 생성
		ArrayList<Student> sList = new ArrayList<Student>();

		// 2. 데이터 추가
//		Student s1 = new Student("조범수", 1);
//		sList.add(s1);

		sList.add(new Student("조범수", 25));

		// 3. 짝궁의 이름 출력
		System.out.println(sList.get(0).getName() + "\t" + sList.get(0).getAge());
		// 본질적으로 어떤 자료형인지 확인할 것!!
		// sList.get(0) --> return type : Student ---> 객체

		// 4. 팀원 데이터를 전부 추가하기

		sList.add(new Student("응원단원 오인영", 31));
		sList.add(new Student("응원단장 정대주", 00));
		sList.add(new Student("팀장 우동희", 00));
		sList.add(new Student("부팀장 엄희수", 00));

		System.out.println("==== 팀원 정보 ====");
		for (Student s : sList) {
			System.out.println(s.getName() + "\t" + s.getAge());
		}

	}

}
