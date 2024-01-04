package dowhile문;

import java.util.Scanner;

public class Ex02dowhile문예제 {

	public static void main(String[] args) {

		
		// <나의 풀이>
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("현재몸무게 : ");
//		int weight = sc.nextInt();
//		System.out.print("목표몸무게 : ");
//		int weight2 = sc.nextInt();
//		
//		int day = 1;
//		
//		do {
//			System.out.print( day++ + "주차 감량 몸무게 : ");
//			int weight3 = sc.nextInt();
//			
//						
//			weight = weight-weight3;
//			
//		}while(weight > weight2);
//		
//		System.out.println(weight + "kg 달성!! 축하합니다!!");

		
		// <풀이>
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 현재 몸무게 입력받기
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		// 3. 목표 몸무게 입력받기
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		// 4. 주차별 감량 몸무게 입력받기
		// ---> 언제 다이어트를 성공할지 모름! 주차도 변수 선언하기
		int week = 1;
		do {
			System.out.print(week + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			week++;
			// 5-1. 현재 몸무게 = 원래 몸무게 - 감량몸무게(변수 더 만들필요 X)
			now -= minus;
			// 5-2. 현재 몸무게가 목표 몸무게에 도달했는지 조건을 판단
			if (now <= goal) {
				System.out.println(now + "kg 달성!! 축하합니다!!");
				break;
			}
		} while (true);

		sc.close();
	}

}
