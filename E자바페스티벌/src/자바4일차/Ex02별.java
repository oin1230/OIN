package 자바4일차;

import java.util.Scanner;

public class Ex02별 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 : ");
		int input = sc.nextInt();

//		for (int j = input; j > 0; j--) {
//			for (int i = j; i > 0; i--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for (int j = 0; j < input; j++) {
			for (int i = input; i > j; i--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}
