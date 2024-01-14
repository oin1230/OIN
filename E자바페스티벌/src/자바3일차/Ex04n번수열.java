package 자바3일차;

import java.util.Scanner;

public class Ex04n번수열 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("n 입력 : ");
		int input = sc.nextInt();

		int num = 1;

		for (int i = 0; i < input; i++) {

			num += i;
			System.out.print(num + " ");
			
			sc.close();

		}

	}

}
