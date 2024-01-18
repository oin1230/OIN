package 자바페최종;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Jf21 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		int[] arr = new int[2];

		int min = point[0] - point[1];

		for (int i = 0; i < point.length; i++) {

			for (int j = i + 1; j < point.length; j++) {

				int gap = point[i] - point[j];

				gap = gap < 0 ? gap * (-1) : gap;

				if (min > gap) {
					min = gap;

					arr[0] = i;
					arr[1] = j;
				}

			}

		}
		System.out.println(Arrays.toString(arr));
	}

}
