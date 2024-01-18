package 자바페최종;

import java.util.Scanner;

public class Jf25 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String num = sc.next();
		
		int sum = 0;
		String[] str = num.split("");
		
		for(int i = 0 ; i<str.length; i++) {
			
				if(str[i].equals("0")) {
					sum +=6;
				}else if(str[i].equals("1")) {
					sum +=2;
				}else if(str[i].equals("2")) {
					sum +=5;
				}else if(str[i].equals("3")) {
					sum +=5;
				}else if(str[i].equals("4")) {
					sum +=4;
				}else if(str[i].equals("5")) {
					sum +=5;
				}else if(str[i].equals("6")) {
					sum +=6;
				}else if(str[i].equals("7")) {
					sum +=3;
				}else if(str[i].equals("8")) {
					sum +=7;
				}else if(str[i].equals("9")) {
					sum +=6;
				}
			
		}
		System.out.println(sum);
		
		
		

	}

}
