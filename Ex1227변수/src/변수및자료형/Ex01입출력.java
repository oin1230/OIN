package 변수및자료형;

// 도구를 꺼내올 때는 반드시 어디에서 거낼 지 improt 구문을 작성
// ---> 직접 작성하기 보다는, 에러에 마우스를 올려 해결
import java.util.Scanner;

public class Ex01입출력 {

	public static void main(String[] args) {
		// 주석 : 코드에 영향을 끼치지 않는 메모
		// 단축키
		// 1) 글자크기 늘리기 : Ctrl+
		// 2) 글자크기 늘리기 : Ctrl-
		// 3) 한 줄 삭제 : Ctrl + D
		// 4) 실행 단축키 : Ctrl + F11
		// 5) 자동 improt 단축키 : Ctrl + Shift + O
		
		// 1. 출력문
		// ---> () 안쪽에 출력하고 싶은 구문 작성
		System.out.println("Hello World!!!!");
		// 출력문 생성 단축키 : syso -> Ctrl + space
		System.out.println("오인영!!!");
		
		// 2. 입력문
		// 2-1) 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 개행(줄바꿈)을 없애고 싶다면, println에서 ln을 지워주기
		System.out.print("글자를 입력하세요 >> ");
		// 2-2) 입력받기
		sc.next();		
		
		
		
		
		
		
		
		
	}

}
