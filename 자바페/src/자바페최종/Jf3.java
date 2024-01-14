package 자바페최종;

public class Jf3 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i = 1; i < 101; i++) {
			
			if(i%2 ==0) {
				System.out.print(-i+" ");
				sum -= i;
			} else {
				System.out.print(i+" ");
				sum += i;
			}
				
		}
		
		System.out.println("\n결과 : " + sum);
		
	}

}
