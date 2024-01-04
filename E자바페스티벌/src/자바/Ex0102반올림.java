package 자바;

import java.util.Scanner;

public class Ex0102반올림 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		
		int num1 = sc.nextInt();
		int rounds = 0;
		
		if(num1%10 >= 5 ) {
			//반올림 
			rounds = num1/10*10+10;
		} else {
			rounds = num1/10*10;
		}
		
		System.out.println("반올림 수 :" + rounds);
		
		
		
	}

}
