package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex04가장큰수찾기 {

	public static void main(String[] args) {

		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 array를 선언하세요
		// 2. 배열 안의 모든 데이터를 임의의 값으로 초기화 하세요.(1~10)
		// 3. 배열안의 데이터 중 가장 큰값을 출력하세요

		// <나의 풀이>
//		int[] array = new int[5];
//		Random ran = new Random();
//		int big = 0;
//		
//		System.out.print("배열안에 들어있는 값 : ");
//		
//		for (int i = 0; i < array.length; i++) {
//			array[i] = ran.nextInt(10) + 1;
//			System.out.print(array[i] + " ");
//			if (array[i] > big) {
//				big = array[i];
//			}
//		}
//
//		System.out.println();
//		System.out.println("가장 큰 값은" + big + " 입니다.");

		// <풀이>

		// 1. 정수형 데이터 5개를 저장하는 배열 선언
		int[] array = new int[5];
		// 2. 랜덤한 숫자로 배열 초기화하기(1~10)
		Random ran = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(10) + 1;
		}
		// 3. 가장 큰 수를 선언하는 변수 max 선언
		int max = 0;
		// 4. max와 배열 안에 들어있는 값 비교학(0번 인덱스부터 차근차근)
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				// 5. 만약 배열안에 들어있는 값이 max보다 크다면,
				// max를 배열안에 있는 값으로 변경하기
				max = array[i];
			}
		}
		// 6. 배열안의 모든 값 출력하기
		System.out.println("배열 안에 들어있는 값 : " + Arrays.toString(array));
			// Arrays.toString(배열의이름) : 
			// 배열안의 모든값을 출력하는 키워드
		// 7. 가장 큰 값 출력하기
		System.out.println("가장 큰 값은 " + max + "입니다.");

	}

}
