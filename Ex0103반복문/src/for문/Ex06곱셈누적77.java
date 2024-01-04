package for문;

public class Ex06곱셈누적77 {

	public static void main(String[] args) {

		// (77*1)+(76*2)+(75*3).....+(1*77) 계산하여 결과출력
		// <나의 풀이>
//		int a = 1;
//		int total = 0;
//		
//		for (int i = 77; i >= 1; i--) {
//			int sum = i * a;
//			a++;
//			total = total + sum;
//		}
//		
//		System.out.println(total);
		// <풀이>
		int sum = 0;
		int num = 1;
		for(int i = 77; i > 0; i--) { // i : 77 --> 1
			sum += (i*num); // num : 1 --> 77
			num++;
		}
		
		System.out.println(sum);

	}

}
