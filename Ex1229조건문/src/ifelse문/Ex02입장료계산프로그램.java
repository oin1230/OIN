package ifelse문;

import java.util.Scanner;

public class Ex02입장료계산프로그램 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
//		
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		
//		System.out.print("인원수를 입력하세요 : ");
//		int people = sc.nextInt();
//		
//		int price = 5000;
//		
//		if(age < 20) {
//			int total = price / 2 * people;
//			System.out.println("총" + total + "원입니다.");
//		} else {
//			int total = price * people;
//			System.out.println("총" + total + "원입니다.");
//		}
		
		// 풀이)
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 나이 입력받기
		System.out.println("====에버랜드에 오신 걸 환여합니다!====");
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		// 3. 인원수 입력받기
		System.out.print("인원수를 입력하세요 : ");
		int people = sc.nextInt();
		// 4. 입장료 계산하기
		int money = 0;
		// ****지역변수(loacal variable)****
		// : {}영역안에서 사용된 변수는 {}영역 안쪽에서만 사용 가능하다!
		// -> {} : 중괄호 영역안을 "scope" 라고 칭함
		if(age < 20) {
			// 4-1. 20세 미만일 경우 입장료 50% 할인(기본 입장료 : 5000원)
			money = (int) (5000 * people *0.5); 
		} else {
			// 4-2. 그렇지 않은 경우 입장료 그대로 계산
			money = 5000 * people;
		}
		// 5. 결과 출력하기
		System.out.println("입장료는" + money + "원 입니다.");
		
	}

}
