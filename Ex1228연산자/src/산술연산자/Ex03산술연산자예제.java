package 산술연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {

	public static void main(String[] args) {

		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		
		// 2. 정수입력 출력하기
		System.out.print("정수 입력 : ");
		// 3. 정수 입력받기
		int num1 = sc.nextInt();
		
		// 4. 백의자리 이하 버리기
		int result1 = (num1 / 100 * 100);
		// 1) num1 - num1 % 100
		System.out.println("결과 값 : " + result1);
		
		
	}

}
