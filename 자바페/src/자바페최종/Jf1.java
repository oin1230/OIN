package 자바페최종;

import java.util.Scanner;

public class Jf1 {

	public static void main(String[] args) {

		// 자페 1번, 8분, 10점
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		
		for(int i = 1; now > goal; i++) {
			System.out.print(i + "주차 감량 몸무게 : ");
			int loss = sc.nextInt();
			now -= loss;
		}
		System.out.println(now + "kg 달성!! 축하합니다!");
	}
	

}
