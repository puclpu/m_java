package 배열응용;

import java.util.Random;

public class 토익문제채점 {

	public static void main(String[] args) {
		int[] cor = new int [999];
		int[] ans = new int [999];
		
		// 1~4까지 랜덤하게 넣고, 프린트
		
		Random r = new Random();
		
		int sum = 0;
		System.out.println("문항번호:\t답안지\t답");
		System.out.println("-------------------");
		for (int i = 0; i < cor.length; i++) {
			cor[i] = r.nextInt(4) + 1;
			ans[i] = r.nextInt(4) + 1;
			System.out.println( (i + 1) + ":\t" +cor[i] + "\t" + ans[i]);
			
			if (cor[i] == ans[i]) {
				sum++;
			}
		}
		System.out.println("-------------------");
		System.out.println( "점수는 " + sum);
	}

}
