package 자바페최종;

import java.util.Random;
import java.util.Scanner;

public class Jf29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int count = 0;
		
		while(true) {
			
			int ran1 = rd.nextInt(10);
			int ran2 = rd.nextInt(10);
			
			System.out.print(ran1+ " + " + ran2 + " = ");
			
			int sum = sc.nextInt();
			
			if(ran1+ran2 == sum) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("Fail...");
				count++;
			}
			if(count == 5) {
				System.out.print("GAME OVER!");
				break;
			}
			
		}
	}

}
