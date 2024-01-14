package 자바3일차;

import java.util.Scanner;

public class Ex06단수곱셈 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("단수 입력 : ");
		int input = sc.nextInt();
		System.out.println("어느 수까지 출력: ");
		int output = sc.nextInt();
		
		System.out.println(input +"단");
		for(int i = 1; i <= output; i++) {
			int sum = input * i;
			System.out.println(input+"*"+i+"="+sum);
			
		}
		
	}

}
