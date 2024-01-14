package 자바5일차;

import java.util.Random;

public class Ex03중복없는로또 {

	public static void main(String[] args) {

		Random ran = new Random();

		int[] array = new int[6];

		for (int j = 0; j < array.length; j++) {
			array[j] = ran.nextInt(6) + 1;

			for (int i = 0; i < j; i++) {
				if (array[j] == array[i]) {
					j--;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("행운의 숫자 : " + array[i]);
		}

	}
}
