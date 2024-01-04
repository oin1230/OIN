package 자바2일차;

import java.util.Scanner;

public class Ex02숫자 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input1 = 0;
		int input2 = 0;

		while (true) {
			System.out.print("A 입력 >> ");
			input1 = sc.nextInt();
			System.out.print("B 입력 >> ");
			input2 = sc.nextInt();
			int result = input1 - input2;
			if (input1 == 0 && input2 == 0) {
				break;
			}
				System.out.println("결과 >> " + result);

			

		}

	}
}
