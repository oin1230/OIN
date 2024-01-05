package 이중for문;

public class Ex01별찍기기초 {

	public static void main(String[] args) {

		// *****
		// System.out.print("*"); 를 사용하여 별5개 찍기

		// system.out.print("*"); 를 사용하여
		// *****
		// *****
		// *****
		// *****
		// *****
		// 출력하기
		// <나의 풀이>
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println("");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println("");
//		for (int i = 0; i <= 4; i++) {
//			for (int j = 0; j <= 4; j++) {
//				System.out.print("*");
//				if (j == 4) {
//					System.out.println();
//				}
//			}
//		}

		// <풀이>
		for (int j=0; j<5; j++) {
			for(int i = 0; i<5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		}

	}


