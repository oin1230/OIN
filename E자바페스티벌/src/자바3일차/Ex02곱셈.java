package 자바3일차;

public class Ex02곱셈 {
	
	public static void main(String[] args) {
		
		//(77*1)+(76*2)+(75*3)+...+(1*77) 를 계산하여 결과를 출력
		
		int sum = 0;
		int num = 1;
		
		for(int i = 77; i > 0; i--) {
			
			sum += i * num;
			num++;
			
		}
		System.out.println(sum);
		
		
	}

}
