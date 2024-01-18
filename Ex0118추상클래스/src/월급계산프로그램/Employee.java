package 월급계산프로그램;

public abstract class Employee {

	
	// 추상 메소드의 정의
	// : 선언만 되어있고, 구현은 되어있지 않은 메소드
	// : {}가 없는 메소드
	
	
	
	// 접근제한자의 종류
	// : 클래스 변수와 메소드를 외부(다른 클래스)에서 접근할 수 있는 범위를 지정
	// - private : 클래스 내에서만 사용가능
	// - default(package) : 같은 패키지에 있는 클래스만 접근가능
	// - protected : 상속 관계에 있거나, 같은 패키지에 있는 클래스만 접근가능
	// - public

	protected String empno; // 사번
	protected String name; // 이름
	protected int pay; // 연봉

	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	public abstract int getMoneyPay();
	
	// print --> 사번 : 이름 : 연봉 을 리턴
	public String print() {
		return empno + "-" + name + "-" + pay;
	}
	
	// 2. 추상 클래스
	// - 추상 메소드를 하나라도 가지고 있으면, 반드시 추상 클래스가 되어야한다.
	// - 추상 클래스도 일반 메소드 가지고 있을 수 있다.
	// - abstract 키워드를 사용해서 선언한다.
	// - 일반 메소드만 가지고 있어도 추상 클래스가 될수 있다.
	// - 구현의 강제성을 가진다
	
	
	// 1. 추상(<-> 구체화) 메소드
		// : {}가 없는 메소드
		// 선언(틀 : 메소드명, 매개변수, 리턴타입)은 되어있으나
		// 로직이 구현되지 않은 메소드
		// - abstract 키워드를 사용해 선언한다.
		
		// 추상화
		// - 클래스 간의 공통점을 찾아내서 공통의 조상을 만드는 작업
		// - 상속 계층도를 따라 올라갈수록 클래스의 추상화는 더욱 심화된다.

	

}
