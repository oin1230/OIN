package 자바페최종;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class Jb5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i<arr.length; i++) {
			
			System.out.print((i+1) + "번째 수 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("정렬 후");
		
		for(int i = 0; i<arr.length; i++) {
			
			for(int j=0; j<arr.length-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					
					int tem = arr[j];
					
					arr[j] = arr[j+1];
					arr[j+1] = tem;
					
				}
			}
		}
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
