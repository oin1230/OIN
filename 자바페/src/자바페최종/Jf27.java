package 자바페최종;

import java.util.Scanner;

public class Jf27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("==== 채점하기 ====");

		String input = sc.next();
		
//		String[] str = new String[input.length()];

		char[] arr = new char[input.length()];

		for (int i = 0; i < input.length(); i++) {
			
//			str[i] = "" + input.charAt(i); 
			arr[i] = input.charAt(i);

		}

		int sum = 0;
		int count = 0;

		
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 'o') {
				count++;
				sum += count;

			} else {
				count = 0;
				
			}
		}

		System.out.println(sum);
	}

}
