package dowhile문;

public class Ex01dowhile문기초 {

	public static void main(String[] args) {

		// do-while문 구조
		do {
			System.out.println("반드시 한 번 실행시키는 문장!");
		} while (false);
		// do-while문은 반드시 한번은 실행시켜야 할 코드가 있을 때 사용!
		// ---> 검사조건이 false여도 반드시 한 번은 실행된다.
		// ---> {} break; 사용하여 중지가능
		
		do {
			System.out.println("break; 사용하여 중지");
			break;
		} while (true);
		
	}

}
