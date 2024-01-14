package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05점수계산 {

	public static void main(String[] args) {

//		// <나의 풀이>
//		int[] array = new int[5];
//
//		Scanner sc = new Scanner(System.in);
//		int num = 1;
//		int sum = 0;
//
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(num + "번째 입력 >> ");
//			array[i] = sc.nextInt();
//			num++;
//			sum += array[i];
//		}
//		System.out.println("입력된 점수 :" + Arrays.toString(array));
//
//		int max = 0;
//		int min = 0;
//		for (int i = 0; i < array.length; i++) {
//
//			if (array[i] > max) {
//				max = array[i];
//			}
//
//			if (i == 0) {
//				min = array[i];
//			} else if (array[i] < min) {
//				min = array[i];
//			}
//		}
//		float avg = (float) sum / array.length;
//
//		System.out.println("최고 점수 : " + max);
//		System.out.println("최저 점수 : " + min);
//		System.out.println("총합 : " + sum);
//		System.out.println("평균 : " + avg);

		Scanner sc = new Scanner(System.in);

		// 1. 성적 데이터를 저장할 수 있는 배열 생성
		int[] score = new int[5];

		// 2. 성적 입력(5개)
		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			score[i] = sc.nextInt();
		}

		// 3. 입력받은 데이터 전부 출력하기
		System.out.println(Arrays.toString(score));

		// 4. 최고 점수(max), 최저 점수(min), 총합(sum) 을
		// 저장할 수 있는 변수 선언하기
		int max = 0;
		int min = score[0];
		int sum = 0;

		// 5. 배열 안에 있는 모든 데이터와 max를 비교하면서 최고점수 구하기
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}

			// 6. 배열 안에 있는 모든 데이터와 min을 비교하면서 최저점수 구하기
			if (score[i] < min) {
				min = score[i];
			}
			
			// 7. 배열 안의 모든 데이터를 더해서 총합 구하기
			sum += score[i];
		}
		
		// 8. 결과값을 출력하기(이때 평균은 소수점이 나올 수 있도록!)
		System.out.println("최고점수 : " + max);
		System.out.println("최저점수 : " + min);
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (float)sum / score.length);

	}

}
