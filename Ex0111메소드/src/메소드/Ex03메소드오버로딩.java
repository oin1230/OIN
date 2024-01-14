package 메소드;

public class Ex03메소드오버로딩 {

	public static void main(String[] args) {

		// 메소드 오버로딩(중복정의)란?
		// : 메소드의 이름은 같지만 매개변수를 다르게 함으로써
		// : 서로 다른 메소드를 만드는 기법
		// * 매개변수의 개수를 다르게하고, 타입을 다르게해서 이름을 똑같이 부여한다.
		
		// 메소드 사용하기


		
	}
	
	// 메소드 오버로딩 성립 조건
	// 1. 메소드 이름이 같아야한다.
	// 2. 매개변수의 개수 혹은 자료형(타입)이 달라야한다.
	// 3. 매개변수와 메소드 이름이 같고, 리턴타입만 다른경우는 오버로딩이 아니다.

	private static double add(double num1, double num2) {
		
		return num1 + num2;
	}
	
	private static int add(int num1, int num2) {
		
		return num1 + num2;
	}
}
