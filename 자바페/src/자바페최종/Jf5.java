package 자바페최종;

import java.util.Scanner;

public class Jf5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		

			

	}

}
