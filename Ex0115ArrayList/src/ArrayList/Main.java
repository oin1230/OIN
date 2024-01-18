package ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// ArrayList
		// : 크기가 가변적인 배열과 같은 형태를 가진 **클래스***
		
		// 1. ArrayList 생성
		// : 레퍼런스 타입의 데이터만 저장할 수 있다.
		// String, Poketmon ....
		
		ArrayList<String> list = new ArrayList<String>();
		// 제네릭기법 책 p.390 참조
		
		// 2. 데이터 추가하기
		list.add("오인영");
		list.add("조범수(신)");
		list.add("정대주님");
		
		// 3. 데이터 가져오기
		System.out.println(list.get(1));
		
		// 4. 데이터를 특정 위치에 추가하기
		list.add(2, "롤");
		
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		// 5. 데이터 삭제하기
		list.remove(2);
		
		System.out.println(list.get(2));
		
		// 6. 데이터 크기 알아보기
		list.size();
		
		System.out.println("list의 크기 : "+ list.size());
		
		// 7. 데이터 전체 삭제하기
		list.remove(0);
		list.clear();
		
		System.out.println("clear를 사용한 후 list의 크기 : "+list.size());
		
		
		
		
		
	}

}
