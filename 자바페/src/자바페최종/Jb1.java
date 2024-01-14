package 자바페최종;

import java.util.Scanner;

public class Jb1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i > 0; i++) {

			System.out.print("A 입력 >> ");
			int num1 = sc.nextInt();
			System.out.print("B 입력 >> ");
			int num2 = sc.nextInt();

			if (num1 == 0 && num2 == 0) {
				break;
			}
			
			System.out.println("결과 >>" + (num1 - num2));

		}
	}

}
