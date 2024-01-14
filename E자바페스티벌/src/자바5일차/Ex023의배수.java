package 자바5일차;

import java.util.Scanner;

public class Ex023의배수 {

	public static void main(String[] args) {

		
		// 숫자를 입력 받아 3의 배수인 숫자를 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1) +"번 째 점수 입력 >> ");
			int input = sc.nextInt();
			array[i] = input;

		}
		
		System.out.print("3의 배수 : ");
		for(int i = 0; i < array.length ; i++) {
			if(array[i] % 3 == 0) {
				System.out.print(array[i] + " ");
			}
		}

		
	}

}
