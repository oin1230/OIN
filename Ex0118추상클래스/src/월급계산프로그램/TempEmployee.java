package 월급계산프로그램;

public class TempEmployee extends Employee {

	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay);
	}
	
	public int getMoneyPay() {

		return pay / 12;
	}

//
//	public String getEmpno() {
//		return empno;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public int getPay() {
//		return pay;
//	}
//
//	public void setEmpno(String empno) {
//		this.empno = empno;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setPay(int pay) {
//		this.pay = pay;
//	}

}
