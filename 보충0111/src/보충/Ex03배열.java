package 보충;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03배열 {

	public static void main(String[] args) {

		// 배열
		// : 여러개의 데이터를 일괄된 순서로 한번에
		// : 다룰수 있는 데이터 구조(자료구조)

		int[] array = new int[5];

		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;

		int num = 10;
		for (int i = 0; i < 5; i++) {

			array[i] = num;

			num += 10;

			System.out.println(array[i]);
		}

		// 1. 정수데이터 10개를 담을수 있는 numArray를 만들어주
		// 2. numArray에 사용자가 입력한 값을 전부 채워주

		int[] numArray = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("숫자를 입력 >> ");
			numArray[i] = sc.nextInt();
		}

		System.out.print(Arrays.toString(numArray));

	}

}
