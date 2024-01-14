package 자바3일차;

import java.util.Scanner;

public class Ex058자리정수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		for(int i = 10000000; i >= 1; i/=10) {
			
			int rest = input / i % 10;
			
			sum+= rest;
		}
		System.out.println("합은"+ sum + "입니다.");
	
		
	}
	
}
	
