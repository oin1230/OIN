package switch문;

import java.util.Scanner;

public class Ex01학점계산프로그램 {

	public static void main(String[] args) {
//		// <나의 풀이>
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수 입력 : ");
//		int totalScore = sc.nextInt();
//		
//		switch(totalScore/10) {
//		case 9, 10 :
//			System.out.println("A학점입니다.");
//			break;
//		case 8 :
//			System.out.println("B학점입니다.");
//			break;
//		case 7 :
//			System.out.println("C학점입니다.");
//			break;
//		default :
//			System.out.println("D학점입니다.");
//			break;
		
		// <풀이>
		// 1. 입력 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 입력받기
		System.out.print("점수를 입력해 주세요 >>");
		int totalScore = sc.nextInt();
		char grade = 'A';
		// 3. 학점 계산하기 --> switch문
		switch(totalScore/10) { 
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		default :
			grade = 'D';
			break;
		
		}
		System.out.println(grade + "학점입니다.");
		
		}
		
	}


