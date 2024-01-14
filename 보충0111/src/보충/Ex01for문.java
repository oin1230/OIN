package 보충;

public class Ex01for문 {

	public static void main(String[] args) {

		// for : 반복횟수가 정해져 있을때
		// (~언제부터 ; ~언제까지)

//		for (int i = 0; i < 3; i++) {
//			System.out.println(i);
//		}

		// 1부터 9까지 출력시켜주세요
		// 구구단 2단
//		for (int i = 1; i < 10; i++) {
////			System.out.println(i * 2);
//			int result = 2 * 1;
//			System.out.println("2*" + i + "=" + result);
//		}
		
		int sum = 0;
		for(int i = 1; i <101; i++) {
			
			if(i % 2 == 0) {
				System.out.print(-i + " ");
				sum -= i;
				
			} else {
				System.out.print(i + " ");
				sum += i;
			}
			
		}
		System.out.println();
		
		System.out.println("결과 : " + sum);
	}

}
