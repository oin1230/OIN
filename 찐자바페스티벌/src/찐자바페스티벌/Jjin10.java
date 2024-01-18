package 찐자바페스티벌;

import java.util.Scanner;

public class Jjin10 {

	public static void main(String[] args) {


		Scanner sc =new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num%10 >= 5) {
			System.out.print("반올림 수 : " + (num/10*10+10));
		} else {
			System.out.print("반올림 수 : " + num/10*10);
			
		}
	}

}
