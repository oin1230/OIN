package 자바2일차;

import java.util.Random;
import java.util.Scanner;

public class Ex03랜덤기회5번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int count = 0;

		while (true) {
			int ranNum1 = ran.nextInt(9) + 1;
			int ranNum2 = ran.nextInt(9) + 1;
			System.out.print(ranNum1 + " + " + ranNum2 + " = ");
			int sum = sc.nextInt();
			if (ranNum1 + ranNum2 == sum) {
				System.out.println("SUCCESS!");
			} else  {
				System.out.println("Fail...");
				count += 1;
				if(count == 5) {
					System.out.println("GAME OVER!");
					break;
				}
			} 
		}

	}

}
