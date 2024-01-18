package 자바페최종;

import java.util.Scanner;

public class Jf8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int in = sc.nextInt();
		
		if(in%10 >= 5) {
			
			in = in/10*10 + 10;
			System.out.print("반올림 수 : " + in);
		} else {
			in = in/10*10;
			System.out.print("반올림 수 : " + in);
			
		}
	}

}
