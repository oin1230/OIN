package 자바4일차;

import java.util.Scanner;

public class Ex03별 {

	public static void main(String[] args) {

		for (int j = 1; j < 6; j++) {

			for (int i = 1; i < 6 - j; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}

			System.out.println();
		}


	}
}
