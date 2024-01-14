package 이차원배열;

public class Ex03이차원배열예제2 {

	public static void main(String[] args) {

		// 이차원배열 예제 - 스네이크 모양
		// 1. 정수형 데이터를 저장할 수 있는 5행 5열크기으 array를 선언하세요
		// 2. 아래와 같이 21~45까지의 숫자를 저장하고 출력하세요

		int[][] array = new int[5][5];

		int num = 21;

		// <나의 풀이>
		for (int j = 0; j < array.length; j++) {
			
			if (j % 2 == 0) {
				for (int i = 0; i < array.length; i++) {
					array[j][i] = num++;
				}
			} else {
				for (int i = (array.length - 1); i >= 0; i--) {
					array[j][i] = num++;
				}
			}

		}
		
		// <풀이>
		// 상동
		

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
