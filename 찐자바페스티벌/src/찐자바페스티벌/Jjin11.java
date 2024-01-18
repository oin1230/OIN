package 찐자바페스티벌;

import java.util.Scanner;

public class Jjin11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int n = sc.nextInt();

		int[][] arr = new int[n][n];

		int num = 1;
		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {

				for (int j = 0; j < arr.length; j++) {

					arr[i][j] = num;
					num++;
				}

			} else {
				for (int j = arr.length-1; j >= 0; j--) {

					arr[i][j] = num;
					num++;

				}
			}

		}
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j=0; j<arr.length; j++) {
				
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}
		
	}

}
