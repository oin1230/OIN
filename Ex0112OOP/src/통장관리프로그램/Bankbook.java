package 통장관리프로그램;

public class Bankbook {

	// 통장관리 프로그램을 만든다고 가정
	// 통장 설계도면 ---> 통장을 관리 할 수 있는 우리만의 자료형 만들기

	// 1. field(data, 속성)
	// 잔액(money)
	// field에 접근제한자를 사용할수 있다.
	private int money;
	// 정보은닉을 지켜주어야 한다.(사용자가 임의로 변경하는 것을 막는다)

	// 2. method(행위, logic, 기능)
	// 입금하다(deposit)
	public void deposit(int money) {

		this.money += money;
		// this : 현재 클래스 자체를 의미하는 키워드
	}

	// 출금하다(withdraw)
	public void withdraw(int money) {
		this.money -= money;
	}

	// 잔액확인(showMoney)
	public int showMoney() {

		return money;
	}

	// static

}
