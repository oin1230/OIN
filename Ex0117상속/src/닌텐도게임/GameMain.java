package 닌텐도게임;

public class GameMain {

	public static void main(String[] args) {
		// 게임을 실행하는 공간
		// 게임칩 가지고 오기;
		Poketmon p = new Poketmon();
		// 게임칩 끼우기
		insert(p);

		// 마리오카트, 젤다의전설 게임칩 가져오기
		Mario m = new Mario();
		insert(m);

		Zelda z = new Zelda();
		insert(z);

		Dongmul d = new Dongmul();
		insert(d);

	}

	// 게임칩을 끼우는 기눙
	private static void insert(GameChip game) {
		game.gameStart();

	}

//	// 메소드 오버로딩을 활용한 방법
//	private static void insert(Mario game) {
//	}

}
