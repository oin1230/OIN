package while문;

import java.util.Scanner;

public class Ex02While문예제 {

	public static void main(String[] args) {

//		// <나의 풀이>
//		Scanner sc = new Scanner(System.in);
//		
//		int num = 0;
//		
//		while(num < 10) {
//			
//			System.out.print("정수 입력 : ");
//			
//			num = sc.nextInt();
//			}		
//						
//		System.out.println("종료되었습니다.");

		// <풀이>
		// 1. 입력받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);
		// 2. 정수입력 : 출력하기
		int num = 0;
//		while (num < 10) {
//			System.out.print("정수 입력 : ");
//			// 3. 정수 입력받기
//			num = sc.nextInt();
//		}
//		// 2~3구간이반복!! 10보다 큰 수를 입력하면 종료!
//		System.out.println("종료 되었습니다.");

		// 무한반복문
		while (true) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			if (num >= 10) {
				System.out.println("종료되었습니다.");
				break;
			}

		}

	}

}
