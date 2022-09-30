package 배열응용;

public class 배열여러개응용 {

	public static void main(String[] args) {
		// 배열 여러개를 응용해서
		// 다양한 타입의 데이터를 넣어보자.
		String[] 식구 = {"아빠", "엄마", "언니", "나"};
		int[] 나이 = {100, 50, 21, 20};
		double[] 키 = {183.5, 159.9, 169.8, 165.6};
		
		for (int i = 0; i < 식구.length; i++) {
			System.out.println(식구[i] + " " + 나이[i] + " " + 키[i]);
		}
	}

}
