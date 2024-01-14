package 자바페최종;

import java.util.Scanner;

public class Jf7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		for (int i = 0; i < 7; i++) {
			
			for(int j = 7; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
