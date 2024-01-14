package 이차원배열;

import java.util.Iterator;

public class Ex02이차원배열예제1 {

	public static void main(String[] args) {

		
		// 1. 정수형 데이터를 저장할 수 있는 5행5열 크기의 array를 선언하세요
		// 2. 아래와 같이 21~45까지의 숫자를 저장하고 출력하세요
		// 21	26	31	36	41
		// 22	27	32	37	42
		// 23	28	33	38	43
		// 2-1) 열부터 데이터가 저장 될수 잇도록 코드작성(위에서 아래방향)
		// 3. 행부터 데이터가 출력될수 있도록 코드작성(왼쪽에서 오른쪽 방향)
		
		// <나의풀이>
		int[][] array = new int[5][5];

		int num = 21;

		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				array[i][j] = num++;
			}
		}

		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
