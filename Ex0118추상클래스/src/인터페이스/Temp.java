package 인터페이스;

public interface Temp {

	// 인터페이스란?
	// : 클래스들이 공통으로 구현해야 하는 기능(강제성)들을 미리 정의
	// - 프로젝트 설계도면 or 작업 명세서(지켜야 하는 규칙)
	
	// 인터페이스의 특징
	// 1. 필드에 들어갈 수 있는 데이터는 반드시 "상수"여야 한다.
	// 2. static 키워드가 있는 필드만 선언 가능하다.
	// 3. 필드에서 static 키워드와 final 키워드가 생략 가능하다.
	// 4. 추상메소드만 가질 수 있다.
	// 5. 메소드를 선언할 때 abstract 키워드 생략이 가능하다.
	// 6. implements 키워드를 사용해서 상속 받을 수 있다.
	// 7. 인터페이스는 다중상속이 가능하다.
	
	// static이란?
	// : 정적인, 고정적인 저장 공간
	// - 실행했을 때, 1순위로 실행되는 공간.
	
	
	// 1. 필드
	public int num = 0;
	
	// 2. 메소드
	public void temp();
	
	
	
	
	
	
	
	
	
	
}
