package jdbc기초;

public class Ex01Join {

	public static void main(String[] args) {
		
		// JDBC(Java Database Connectivity) 필요성
		// : 관계형 DB에 저장된 data를 접근 및 조작할 수 있게하는
		// : 인터페이스 기반 자바 API
		
		// 드라이버로딩 -> DB연결 -> Query전송 ->
		// 결과를 이용한 작업처리 -> 자원반납
		
		try {
			// JDBC 인터페이스 사용방법!
			// 1. 드라이버 로딩
			// JDBC 드라이버란?
			// : Java에서 제공해주는 인터페이스들을 데이터베이스 회사들에서
			// : 상속을 받아서 로직(몸체)을 구현한 클래스 파일들의 모음
			
			// try 구문
			// : 예외가 발생할 수도 있지만, 우선 시도해보는 구간
			Class.forName("com.mysql.cj.jdbc.Driver");
			// --> 반드시, 프로젝트에 jar파일 넣어주기!
			// jar파일이란,
			// : 클래스파일들을 여러개 모아놓은 압축파일
			// 프로젝트에 jar파일 추가하는 방법.
			// 프로젝트 선택 -> 마우스 우클릭 -> build path
			// -> configure build path -> libraries 탭 선택
			// -> class path 선택 -> 우측 add external jars 선택
			// -> 원하는 jar파일 경로 선택 -> aplly and close
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// catch 구문
			// : 예외가 발생했을 때, 어떤 로직을 수행할 지 작성하는 구간
			// () 안쪽에 있는 매개변수는,
			// 어떤 에외상황을 잡아줄건지 기술하는 공간!
			e.printStackTrace();
			// 예외상황이 왜 발생했고, 어디서 문제가 나고 있는지
			// 출력해주는 구문 ---> 개발할때만 사용하기!
		}
		

	}

}
