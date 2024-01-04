package while문;

import java.util.Scanner;

public class Ex03while문예제 {

	public static void main(String[] args) {

		// 1. 입력받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);
		// 2. 정수 입력 출력하기
		int sum = 0;
		while (true) {
			System.out.print("정수 입력 : ");
			// 3. 정수 입력받기
			int input = sc.nextInt();
			// 4. 입력받을 정수 누적하기
			// ----> 누적시킬 변수 하나 필요!
			// sum += input;
			sum = sum + input;
			System.out.println("누적결과 : " + sum);
			
			if(input == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		// 5. 2~4까지 반복!

//		// <나의 풀이1>
//		Scanner sc = new Scanner(System.in);
//		
//		int num = 0;
//		int total = 0;
//		
//		while(num >= 0) {
//			
//			System.out.print("정수 입력 : ");
//			num = sc.nextInt();
//			total += num;
//			System.out.println("누적 결과 : " + total);
//		}
//		
//		System.out.println("종료되었습니다.");
//		
//		
//		// <나의 풀이2>
//		while(true) {
//			System.out.print("정수 입력 : ");
//			num = sc.nextInt();
//			total = total + num;
//			System.out.println("누적결과 : " + total);
//			if(num < 0) {
//				
//				System.out.println("종료되었습니다.");
//				break;
//				
//			}
//		}

	}
}
