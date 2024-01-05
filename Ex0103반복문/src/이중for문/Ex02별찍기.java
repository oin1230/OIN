package 이중for문;

public class Ex02별찍기 {
	public static void main(String[] args) {

		// 별찍기
		// *
		// **
		// ***
		// ****
		// *****
//		
//		System.out.print("*");
//		System.out.println();
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");

		// <나의 풀이>
//		for (int i = 0; i < 5; i++) {
//
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//
//			}
//			System.out.println();
//		}

		// <나의 풀이>
		// 역순
//		for (int a = 0; a < 5; a++) {
//
//			for (int b = a; b < 5; b++) {
//				System.out.print("*");
//
//			}
//			System.out.println();
//		}

		// <풀이>
		for (int j = 1; j < 6; j++){
		for (int i = 0; i < j; i++) {
			System.out.print("*");
		}
		System.out.println();
		}

	}

}
