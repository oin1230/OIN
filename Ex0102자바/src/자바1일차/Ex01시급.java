package 자바1일차;
import java.util.Scanner;
public class Ex01시급 {

	public static void main(String[] args) {

		
Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		int salary = 0;
		
		if(time <= 8) {
			salary = time * 5000;
		} else {
			salary = 8 * 5000 + (time-8) * 7500;
		}
		System.out.println("총 임금은 " + salary + "원 입니다.");
	}

}
