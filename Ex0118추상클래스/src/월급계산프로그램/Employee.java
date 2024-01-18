package 월급계산프로그램;

public abstract class Employee {

	// 접근제한자의 종류
	// : 클래스 변수와 메소드를 외부(다른 클래스)에서 접근할 수 있는 범위를 지정
	// - private : 클래스 내에서만 사용가능
	// - default : 같은 패키지에 있는 클래스만 접근가능
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

	

}
