package switch문;

import java.util.Scanner;

public class Ex02자판기프로그램 {

	public static void main(String[] args) {

//		// <나의 풀이>
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("금액을 입력하세요. ");
//		int money = sc.nextInt();
//		
//		System.out.println("메뉴를 고르세요.");
//		
//		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
//		int menu =sc.nextInt();
//		int price = 0;
//		
//		if(menu == 1) {
//			price = 700;
//		} else if (menu == 2) {
//			price = 1000;
//		} else {
//			price = 500;
//		}
//		System.out.println("잔돈 : " + (money - price)+ "원");
//		
//		System.out.println("금액을 입력하세요. ");
//		int money2 = sc.nextInt();
//		
//		System.out.println("메뉴를 고르세요.");
//		
//		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
//		int menu2 =sc.nextInt();
//		int price2 = 0;
//		
//		switch(menu2) {
//		case 1 :
//			price2 = 700;
//			break;
//		case 2 :
//			price2 = 1000;
//			break;
//		case 3 :
//			price2 = 500;
//			break;
//		}
//		System.out.println("잔돈 : " + (money2 - price2) + "원");
//		
		
		// <풀이>
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 금액을 입력하세요. 출력하기
		System.out.print("금액을 입력하세요 >>");
		// 3. 입력금액 저장할 변수 선언하기
		int money = sc.nextInt();
		// 4. 메뉴판 출력하기
		System.out.println("메뉴를 고르세요.");
		System.out.print("1. 아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >>");
		// 5. 사용자가 선택한 메뉴 입력받기
		int menu = sc.nextInt();
		// 6. 사용자가 선택한 메뉴가 무엇인지 판단하기
		int change = money ;
		
		if(menu == 1) {
			//6-1. 아우터(700원)을 골랐을 경우
			// 입력한 금액이 선택한 메뉴의 금액보다 더 큰지 판단
			
			if(money >= 700) {
				change = money-700;				
			} else {
				System.out.println("돈이 부족해요 ㅠㅠ");
			}
		} else if(menu == 2) {
			if(money >= 1000) {
				change = money-1000;		
			} else {
				System.out.println("돈이 부족해요 ㅠㅠ");
			}
		} else if(menu == 3) {
			if(money >= 500) {
				change = money -500;
			} else {
				System.out.println("돈이 부족해요 ㅠㅠ");
			}
		}  else {
			System.out.println("메뉴를 다시 골라주세요.");
		}
		
		System.out.println("잔돈은 : " + change + "원 입니다.");
		
//		int cost1 = change/1000;
//		int cost2 = change%1000/500;
//		int cost3 = change%1000%500/100;

		// <풀이>
//		System.out.print("천원 : " + change/1000 + "개, ");
//		System.out.print("오백원 : " + change%1000/500 + "개, ");
//		System.out.print("백원 : " + change%1000%500/100 + "개, ");
		
		int cost1 = change/1000;
		int cost2 = (change-cost1*1000)/500;
		int cost3 = (change-(cost1*1000+cost2*500))/100;
		
		System.out.println("천원 : "+ cost1+"개," + "오백원 :" + cost2+"개," + "백원 : " + cost3 +"개");
		
	}

}
