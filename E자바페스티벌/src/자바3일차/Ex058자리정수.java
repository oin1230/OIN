package 자바3일차;

import java.util.Scanner;

public class Ex058자리정수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int sum = 0;

		// <1>
//		for(int i = 10000000; i >= 1; i/=10) {
//			
//			int num = input / i % 10;
//			
//			sum+= num;
//		}

		// <2>
//		int su = 1;
//		for (int i = 10; i <= 100000000; i *= 10) {
//			
//			int num = input % i / su;
//			su *= 10;
//			sum += num;
//		}
		// <3>
		for (int i = 1; i <= 8; i++) {

			int n = input % 10;
			input /= 10;
			sum += n;
		}
		

		System.out.println("합은" + sum + "입니다.");

	}

}
