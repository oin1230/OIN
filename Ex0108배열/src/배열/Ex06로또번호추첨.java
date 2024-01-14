package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex06로또번호추첨 {

	public static void main(String[] args) {

		Random ran = new Random();

		int[] lotto = new int[5];
		// 1. lotto의 0번방 데이터를 랜덤한 수로 초기화
		// 2. lotto의 1번방 데이터를 랜덤한 수로 초기화
		// 3. lotto[0]과 lotto[1]의 값이 같은지 비교
		// --> 같다면 lotto[1]의 값이 같은지 비교
		// 4. lotto의 2번방 데이터를 랜덤한 수로 초기화
		// 4-1. lotto[0]과 lotto[2]의 값이 같은지 비고
		// --> 같다면 lotto[2]의 다시 랜덤한 숫자 부여하기
		// 4-2 lotto[1]과 lotto[2]의 값이 같은지 비교
		// --> 같다면 lotto[2] 다시 랜덤한 숫자 부여하기
		// 5. lotto의 3번방 데이터를 랜덤한 수로 초기화

		for(int j = 0; j < lotto.length; j++) {
			lotto[j] = ran.nextInt(5)+1;
			
			for (int i = 0; i < j; i++) {
				if(lotto[i] == lotto[j]) {
					j--;
					break;
				}
			}
			
		}
		
		
		System.out.println("=====로또타임=====");
		System.out.println("이번주 출력번호는요...!!두구두구두구!!");
		System.out.println(Arrays.toString(lotto));

	}

}
