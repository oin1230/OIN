package 자바3일차;

public class Ex01양수음수계산 {

	public static void main(String[] args) {

		// 1-2+3-4+....+99-100를 계산하여 답을 출력하시요
		int sum = 0;

		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 1) {
				sum += i;
				System.out.print(i + " ");
			} else {
				int j = i * -1;
				sum += j;
				System.out.print(j + " ");
			}

		}
		System.out.println();
		System.out.println("결과 :" + sum);

	}

}
