package 메소드;

import java.util.Scanner;

public class Ex05완전수구하기 {

	public static void main(String[] args) {

		// 완전수
		// : 자기 자신을 제외한, 약수들의 합이 자기 자신인 수
		// 6
		// 1 + 2 + 3 6
		// 10 --> 완전수 x

		Scanner sc = new Scanner(System.in);
		System.out.print("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);

		System.out.println("약수 합 :" + getSum(num1));
		System.out.print("입력 : " );
		int num3 = sc.nextInt();
		System.out.println(isPerfect(num3));
		
	}

	// 1. 약수 찾기 메소드
	// 메소드명 : isDivisor
	// 매개변수 : 2개 int
	// 리턴타입 : boolean

	// <나의 풀이>
	public static boolean isDivisor(int num1, int num2) {
		
		if(num1 % num2 == 0) {
			return true;
		} else {
		return false;
		}
}

//	 <풀이>
	// 상동


	// 2. 완전 수 구하기 메소드
	private static int getSum(int num1) {

		int sum = 0;

		for (int i = 1; i < num1; i++) {
			// ** 기존 로직
//			if (num1 % i == 0) {
			// ** 메소드를 호출한 로직
			// 메소드 구조 안에 메소드를 새롭게 구현하 수는 없으나
			// 메소드 자체를 호출하여 사용하는 것은 가능하다.
			if(isDivisor(num1, i) == true ) {
				
				sum += i;
			}
		}
		return sum;

	}
	
	public static boolean isPerfect(int num) {
		
		// 풀이
		boolean result = false;
		
		if(getSum(num) == num) {
			// num은 완전수
			result = true;
		} else {
			result = false;
		}
		
		return result;
		
		
		//<나의 풀이>
//		if( num == getSum(num) ) {			
//			return true;
//		} else {
//			return false;
//		}
		
	}
	
	
	
	

}
