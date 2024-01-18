package 찐자바페스티벌;

import java.util.Scanner;

public class Jjin1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int[][] arr = new int[num][num];
		
		int n = 1;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j=0; j< arr.length; j++) {
				
				arr[i][j] = n;
				
				n+=num;
			
				
			}
			
			
			
			
			
		}
		
		
			
		

		
	}

}
