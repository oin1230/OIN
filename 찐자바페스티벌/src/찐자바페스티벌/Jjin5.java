package 찐자바페스티벌;

import java.util.Scanner;

public class Jjin5 {

	public static void main(String[] args) {

		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("총금액 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("잔돈 : " + num + "원");
		
		System.out.println("10000원 : " + num/10000 +"개");
		System.out.println("50000원 : " + num%10000/5000 +"개");
		System.out.println("1000원 : " + num%5000/1000 +"개");
		System.out.println("500원 : " + num%1000/500 +"개");
		System.out.println("100원 : " + num%500/100 +"개");
	}

}
