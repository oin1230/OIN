package 배열;

public class Ex01배열기초 {

	public static void main(String[] args) {

		// 배열(Array)의 자료구조
		// : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 자료구조
		
		// 배열의 특징
		// 1.같은 자료형만 저장할 수 있다.
		// 2. 인덱스 번호를 가지고 있다.
		//    인덱스 번호는 0번부터 시작해서 차례로 1씩 증가한다.
		// 3. 크기가 고정적이다
		
		// 배열 선언하는 방법
		// 자료형[] 변수명 = new 자료형[N];
		int[] numbers = new int[5];
		System.out.println(numbers);
		// numbers ---> N칸짜리 배열이 어디있는지
		//				주소값을 참조하는 레퍼런스 변수
		
		// new ---> 레퍼런스 변수 생성하는 키워드
		
		// 주소값이라는 개념의 등장이유
		// : 자바에서는 데이터를 저장할 수 있는 공간이 분리되어 있다.
		// --> 서로 다른 저장공간에 있는 데이터를 불러오기 위해서는
		//	   해당하는 데이터가 어디에 저장되어 있는지 주소값이 필요!
		
		// 1) 스택(Stack) 영억
		// : 비교적 작은 양의 데이터를 저장하는 공간
		// 2) 힙(Heap) 영역
		// : 커다랗고, 복잡한 데이터를 저장하는 공간
		// --> Garbage Collector(GC)
		//	   주기적으로 필요없는 데이터들을 정리해준다
			
		// 배열 안에 데이터를 저장하는 방법
		// --> 정확하게 방번호(인덱스)를 지정한 후에 저장
		
		// 선언한 배열의 2번째 칸에 15라는 값을 넣겠다.
		numbers[1] = 15;
		System.out.println(numbers[1]);
		
		// index를 초과하면 에러 발생
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		// at 배열.Ex01배열기초.main(Ex01배열기초.java:38)
		// numbers[5] = 20;
		
		
		
		
		
		
		
		
		
	}

}
