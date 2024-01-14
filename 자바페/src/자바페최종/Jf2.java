package 자바페최종;

import java.util.Scanner;

public class Jf2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("일한시간을 입력하세요 : ");
		int work = sc.nextInt();
		int reward = 5000;
		int sum = 0;

		if (work > 8) {
			sum = (8 * reward) + (work - 8) * (int) (reward * 1.5);
		} else {
			sum = reward * work;
		}

		System.out.println("총 입금은 " + sum + "원 입니다.");

	}

}
