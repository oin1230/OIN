package 찐자바페스티벌;

public class Jjin8 {

	public static void main(String[] args) {

		int base = 3;
		int n = 2;
		int result = PowerN(base, n);
		System.out.println("결과 학인 : " + result);
		
	}
	
	public static int PowerN(int base, int n) {
		
		 int result = 1;
		
		for(int i = 0; i<n; i++) {
			
			result = result*base;
		}
		
		
		return result;
		
	}

}
