package dowhile문;

import java.util.Random;

public class EX랜덤수만들기 {

	public static void main(String[] args) {

		// 랜덤한 숫자를 뽑아내는 방법
		// 1. 랜덤한 숫자를 뽑아내는 도구 꺼내오기
		Random ran = new Random();
		// 2. 랜덤한 수 생성하기
		// 2-1. 0부터 시작해서 추출하고싶은 숫자의 갯수를 적기
		// 2-2. 1~9추출 nextInt(추출한숫자범위)+조건
		int ranNum = ran.nextInt(9)+1;
		
		System.out.println(ranNum);
		
		
	}

}
