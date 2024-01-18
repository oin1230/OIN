package PoketmonGame;

import java.util.Scanner;

public class PoketmonMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 실행공간

		// 두마리 포켓몬 생성(객체 생성)
		// name / type / skill / hp / atk
		// 메타몽 / 노멀 / 변신하기 / 80 / 10
		// 피카츄 / 전기 / 백만볼트 / 100 / 15

		Poketmon meta = new Poketmon("메타몽", 80, 10, "변신하기", "노멀");

		Poketmon pika = new Poketmon("피카츄", 100, 15, "백만볼트", "전기");

		while (true) {
			System.out.println("포켓몬을 선택하세요. ");
			System.out.print("[1]메타몽 [2]피카츄 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				// 사용자가 메타몽을 선택
				System.out.print("공격을 선택하세요.");
				System.out.print("[1]일반공격 [2]스킬공격 >> ");
				int choiceAtk = sc.nextInt();
				if (choiceAtk == 1) {
					// 메타몽이 피카츄를 일반 공격하겠다.
					// 1.메타몽은 atk()만큼 피카츄의 hp()가 감소한다
					// 피카츄의 현재 hp = 피카츄의 현재 hp - 메타몽의 atk
					pika.setHp(pika.getHp() - meta.getAtk());
					
					// 2. 두마리 포켓몬의 현재 hp 출력!
					System.out.println("메타몽의 hp : " + meta.getHp());
					System.out.println("피카츄의 hp : " + pika.getHp());
					
					
				} else if (choiceAtk == 2) {
					// 메타몽이 피카츄를 스킬 공격하겠다.
					// 1. 메타몽의 atk의 1.5배만큼 피카츄의 hp 감소한다.
					// 피카츄의 현제 hp = 피카츄의 현재hp = 메타몽의 atk *1.5
					
					pika.setHp((int)(pika.getHp() - meta.getAtk()*1.5));
					
					// 2. 메타몽의 스킬 출력
					System.out.println(meta.getName()+"!!!!"+meta.getSkill()+"!!!!");
					
					// 3. 두마리 포켓몬의 현재 hp 출력
					System.out.println("메타몽의 hp : " + meta.getHp());
					System.out.println("피카츄의 hp : " + pika.getHp());
					
				}
			} else if (choice == 2) {
				// 사용자가 피카츄를 선택
				System.out.print("공격을 선택하세요.");
				System.out.print("[1]일반공격 [2]스킬공격 >> ");
				int choiceAtk = sc.nextInt();
				if (choiceAtk == 1) {
					// 1. 피카츄가 메타몽를 일반 공격하겠다.
					meta.setHp(meta.getHp() - pika.getAtk());
					
					// 2. 두마리 포켓몬의 현재 hp 출력!
					System.out.println("메타몽의 hp : " + meta.getHp());
					System.out.println("피카츄의 hp : " + pika.getHp());
				} else if (choiceAtk == 2) {
					// 피카츄가 메타몽을 스킬 공격하겠다.
					// 피카츄의 atk*1.5 만큼 메타몽의 hp 감소
					meta.setHp((int)(meta.getHp() - pika.getAtk()*1.5));
					
					// 2. 피카츄의 스킬 출력
					System.out.println(meta.getName()+"!!!!"+meta.getSkill()+"!!!!");
					
					// 3. 두마리 포켓몬의 현재 hp 출력
					System.out.println("메타몽의 hp : " + meta.getHp());
					System.out.println("피카츄의 hp : " + pika.getHp());
					
				}
			} else {
				System.out.print("번호를 잘못 누르셨습니다.");
			}
			/////////////////////////////////////////////////////////
			// 1. 둘 중의 한마리의 포켓몬이 hp가 0보다 작거나 같을 때 프로그램 종료
			// 2. 둘중의 승자가 누구인지 출력
			// 3. 단 poketmon 설계도는 건들지 않고
			if(meta.getHp() <= 0 || pika.getHp() <= 0) {
				
				if(meta.getHp() > pika.getHp()) {
					System.out.println(pika.getName()+". 흙으로 돌아감");
					System.out.println("강하다. " + meta.getName());
					break;
				} else {
					System.out.println(meta.getName()+". 흙으로 돌아감");
					System.out.println("강하다. " + pika.getName());
					break;
				}
				
			}
		}

	}

}
