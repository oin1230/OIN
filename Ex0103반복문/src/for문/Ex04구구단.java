package for문;

import java.util.Scanner;

public class Ex04구구단 {

	public static void main(String[] args) {

		// 사용자에게 입력받아 구구단 계산하기
		// <나의풀이>
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("단 입력 : ");
//		int input = sc.nextInt();
//		System.out.print("어느 수까지 출력 : ");
//		int output = sc.nextInt();
//		
//		for(int i = 1; i <= output; i++){
//			System.out.println(input+ "*" + i +"=" + (input * i));
//		}

		// <풀이>
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 단 입력받기
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		// 3. 수 입력받기
		System.out.print("어느 수까지 출력 : ");
		int su = sc.nextInt();

		for (int i = 1; i <= su; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}

	}

}
