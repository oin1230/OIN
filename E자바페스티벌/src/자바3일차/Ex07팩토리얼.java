package 자바3일차;

import java.util.Scanner;

public class Ex07팩토리얼 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		int sum = 1;
		
		for(int i = 1; i<=input ; i++) {
			
			sum *= i;
			
		}
	
		System.out.println("출력 : " + sum);
		
		
	}

}
