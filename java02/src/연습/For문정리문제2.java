package 연습;

public class For문정리문제2 {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i = 1; i <= 1000; i = i+3) {
			if (sum >= 100) {
				break;
			}
			if (i % 5 == 0) {
				// 5의  배수는 skip
				continue;
			}
			sum += i;
		}
		
		System.out.println(sum);
		
	}

}
