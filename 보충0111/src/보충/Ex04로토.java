package 보충;

import java.util.Arrays;
import java.util.Random;

public class Ex04로토 {

	public static void main(String[] args) {

		// 중복없이 숫자 6개 봅기
		int[] roto = new int[6];

		// 랜덤 값으로 배열에 값 담아주기
		Random rd = new Random();

		roto[0] = rd.nextInt();
		roto[1] = rd.nextInt();
		roto[2] = rd.nextInt();
		roto[3] = rd.nextInt();
		roto[4] = rd.nextInt();

		for (int i = 0; i < roto.length; i++) {
			roto[i] = rd.nextInt(10) + 1;

			for (int j = 0; j < i; j++) {
				if (roto[j] == roto[i]) {
					// 앞서 뽑은 숫자와 같은 수가 있다면
					// 다시 뽑기 위해서 인덱스 값을 1감소
					i--;

				}
			}

		}
		System.out.println(Arrays.toString(roto));

	}

}
