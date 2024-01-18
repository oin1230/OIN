package 자바페최종;

import java.util.ArrayList;
import java.util.Scanner;

public class Jf20 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력 >> ");
//		int num = sc.nextInt();
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		
//		while(num>0) {
//			arr.add(num%2);
//			num/=2;
//		}
//		
//		// ArrayList 배열의 끝부터 출력
//		for(int i = arr.size()-1; i>=0; i--) {
//			System.out.print(arr.get(i) + " ");
//		}
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 >> ");
		int num = sc.nextInt();
		String result= "";
		
		while(num>0) {
			
			result = num%2 + " " + result;
			//1 0 1 0 . 
			num /= 2;
			
		}
		
		System.out.println(result);
	}

}
