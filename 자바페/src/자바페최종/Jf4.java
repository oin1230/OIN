package 자바페최종;

import java.util.Scanner;

public class Jf4 {

	public static void main(String[] args) {

		// 거스름돈을 입력받아 내어줘야하는 지폐의 개수

		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();
		
		System.out.println("잔돈 :" + money);
		System.out.println("10000원 : " + money/10000 + "개");
		System.out.println("5000원 : " + money%10000/5000 +"개");
		System.out.println("1000원 : " + money%5000/1000 +"개");
		System.out.println("500원 : " + money%1000/500 +"개");
		System.out.println("100원 : " + money%500/100 +"개");
		
	}

}
