package 반복문;

public class For문연습3 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10000; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("---------------");
		// 3~11까지 더해보세요.
		sum = 0;
		for (int i = 3; i <= 11; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
