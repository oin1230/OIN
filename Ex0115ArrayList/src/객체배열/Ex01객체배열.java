package 객체배열;

import java.util.Arrays;

public class Ex01객체배열 {

	public static void main(String[] args) {
		// 1. 객체 배열 생성
		// 자료형[] 변수명 = new 자료형[칸수];
		// 포켓몬 자료형 3개를 보관할 수 있는 bag 배열 생성

		Poketmon[] bag = new Poketmon[3];

		// 객체 배열 0번방 출력
		System.out.println("배열의 0번방 : " + bag[0]);

		// 객체 배열의 0번방에 포켓몬을 넣업자.
		// 피카츄를 만들자/
//		Poketmon pika = new Poketmon("피카츄", 100, 15, "백만볼트", "전기");
//		bag[0] = pika;
		bag[0] = new Poketmon("피카츄", 100, 15, "백만볼트", "전기");
		// bag의 1번방 >> 파이리 / 불 / 화염방사 / hp : 90 / atk : 12
		bag[1] = new Poketmon("파이리", 90, 12, "화염방사", "불");
		// bag의 2번방 >> 꼬부기 / 물 / 물대포 / hp : 88 / atk : 14
		bag[2] = new Poketmon("고북희", 88, 14, "물대포", "물");

		System.out.println(bag[0].getName());
		System.out.println("=====포켓몬 정보 출력=====");

		for (int i = 0; i < bag.length; i++) {
			System.out.println(bag[i].getName() + "\t" + bag[i].getType() + "\t" + bag[i].getHp());
		}
		
		// for-each문
		// 배열과 같이 여러개의 데이터를 저장하는 자료구조와 함께 사용
		// 동작원리
		// 배열안의 저장되어있는 데이터를 for문에서 순차적으로 꺼내서 
		// : 기준으로 왼쪽에 있는 변수에 담아주는 흐름을 가지고 있다.
//		for( 변수의 자료형 / 새로운 변수명 : bag(반복하고자 하는 변수명)  ) {
		for( Poketmon p : bag)	{
			System.out.println(p.getName()+"\t"+p.getType()+"\t"+p.getHp());
		}
		
		
		

}

}
