package 찐자바페스티벌;

import java.util.Scanner;

public class Jjin2 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++ ) {
			
			System.out.print(i + "번째 별의 수 : ");
			
			arr[i] = sc.nextInt();		}
		
		
		for(int i = 0; i<arr.length; i++) {
			
			System.out.print(arr[i] + " : ");
			
			for(int j = 0; j < arr[i]; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		
		
	}

}
