package 월급계산프로그램;

public class RegularEmployee extends Employee {

	
	 private int bonus; //
	
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}
	
	public int getMoneyPay() {	
		return (pay + bonus) / 12;
	}
	
	

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
//	public int getBonus() {
//		return bonus;
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
//
//	public void setBonus(int bonus) {
//		this.bonus = bonus;
//	}



}
