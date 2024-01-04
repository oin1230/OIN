package 자바2일차;

import java.util.Scanner;

public class Ex01목표몸무게 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		
		int week = 1;
		
		do {
			System.out.print(week +"주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			now = now - minus;
			week++;
			
			if(now <= goal) {
				System.out.println(now + "kg 달성!! 축하합니다!");
				break;
			}
					
		}while(true);
		
		
		
	}

}
