package 배열응용;

import java.util.Random;

public class 랜덤값배열에넣기 {

	public static void main(String[] args) {
		// 1. 1000개 데이터를 넣을 공간을 만들어라.
		int[] lotto = new int[6];
		
		// 2. 랜덤한 값 만들어주는 부품을 만들어라.
		Random r = new Random();
		
		// 3. 반복문으로 랜덤한 값 1000개를 만들어서 저장공간에 저장
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(32) + 1;
		}
		
		// 4. 1000개 프린트 해보자.
		for (int i : lotto) {
			System.out.println(i);
		}
	}

}
