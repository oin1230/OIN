package 자바페최종;

public class Jf6 {

	public static void main(String[] args) {

		// (77*1) + (76*2) + (75*3)....+(1*77)
		
		int sum = 0;
		int num = 1;
		
		for(int i = 77 ; i > 0; i--) {
			sum += i*num;
			num++;
			
		}
		System.out.println(sum);
		
		
	}

}
