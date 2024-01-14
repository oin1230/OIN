package 배열;

public class Ex02배열기초 {

	public static void main(String[] args) {

		int[] numbers = new int[5];

		// 배열의 길이
		// 변수명.length;
		int length = numbers.length;
		System.out.println("배열의 길이 : " + length);

		// 배열의 각 칸을 5의 배수로 초기화 해주세요.
//		numbers[0] = 5;
//		numbers[1] = 10;
//		numbers[2] = 15;
//		numbers[3] = 20;
//		numbers[4] = 25;
		// <나의 풀이>
//		int j = 1;
//		for (int i = 0; i < 5; i++) {
//			numbers[i] = 5 * j;
//			j++;
//			System.out.println(numbers[i]);
//		}

		// <풀이>
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 5 * (i + 1);
		}

		// 배열의 값을 전부 출력
		// <나의풀이>
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		// 배열의 생성함과 동시에 데이터를 집어넣는 방법
		String[] names = {"오인영", "조범수", "정대주"};
		// 조범수라는 데이터를 출력하기
		System.out.println(names[1]);

	}

}
