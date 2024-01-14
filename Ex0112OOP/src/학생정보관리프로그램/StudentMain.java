package 학생정보관리프로그램;

public class StudentMain {

	public static void main(String[] args) {

		Student stu1 = new Student("임경남", "20242222", 19);
		// new Student() ---> 객체를 생성하는 순간에 실행되는 메소드!
		// *****생성자(Constructor)*****

		Student stu2 = new Student();
		stu2.setName("ㅇㅇㅇ");
		stu2.setNumber("20220458");
		stu2.setAge(20);
		stu2.setScoreJava(90);
		stu2.setScoreWeb(25);
		stu2.setScoreAndroid(50);

		// 이름, 자바 점수 출력
		System.out.println(stu2.getName());
		System.out.println(stu2.getScoreJava());
		// 메소드 이름 위에 마우스 올려서 포스트잇 모양이 뜨면
		// 초록색 동그라미 오른쪽에 있는 자료형이 리턴타입을 의미한다.

	}

}
