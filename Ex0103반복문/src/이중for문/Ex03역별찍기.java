package 이중for문;

public class Ex03역별찍기 {

	public static void main(String[] args) {

		// 역별찍기
		// *****
		// ****
		// ***
		// **
		// *
		// system.out.print("*"); 사용

		// <나의 풀이>
//		for (int j = 0; j < 5; j++) {
//			for (int i = j; i < 5; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for(int j = 5; j>0; j--) {
			for (int i=0; i<j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
