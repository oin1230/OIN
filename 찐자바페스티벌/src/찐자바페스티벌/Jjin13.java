package 찐자바페스티벌;

import java.util.Scanner;

public class Jjin13 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단수입력 : ");
		int dan = sc.nextInt();
		
		System.out.println("어느 수까지  출력 : ");
		int out = sc.nextInt();
		
		System.out.println(dan +"단");
		for(int i = 1; i<=out; i++) {
			
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
	}

}
