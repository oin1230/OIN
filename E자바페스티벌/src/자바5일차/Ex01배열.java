package 자바5일차;

import java.util.Random;

public class Ex01배열 {
	public static void main(String[] args) {

		// 8칸크기의 배열을 선언하고 랜덤수로 초기화한후 가장큰수 가장작은수
		Random ran = new Random();

		int[] array = new int[8];

		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < array.length; i++) {

			array[i] = ran.nextInt(56) + 1;
			System.out.print(array[i] + " ");
		}

		int max = 0;
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}

			if (array[i] < min) {
				min = array[i];
			}
		}

		System.out.println();
		System.out.println("가장 큰값 : " + max);
		System.out.println("가장 작은값 : " + min);

	}

}
