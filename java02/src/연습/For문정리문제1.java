package 연습;

public class For문정리문제1 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 33; i < 223; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("--------------");
		
		sum = 0;
		for (int i = 55; i <= 4500; i = i + 2) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("--------------");
		
		sum = 0;
		for (int i = 0; i <= 6000; i = i + 5) {
			sum += i;
		}
		System.out.println(sum);
	}

}
