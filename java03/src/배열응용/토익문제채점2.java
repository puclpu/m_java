package 배열응용;

import java.util.Random;

public class 토익문제채점2 {

	public static void main(String[] args) {
		int[] cor = new int [990];
		int[] ans = new int [990];
		
		Random r = new Random();
		int sum = 0;
		
		System.out.println("번호:\t답안\t내답");
		System.out.println("------------------");
		
		for (int i = 0; i < ans.length; i++) {
			cor[i] = r.nextInt(4) + 1;
			ans[i] = r.nextInt(4) + 1;
			
			System.out.println((i + 1) + ":\t" + cor[i] + "\t" + ans[i]);
			
			if (cor[i] == ans[i]) {
				sum++;
			}
		}
		System.out.println("------------------");
		System.out.println("내 점수: " + sum);
	}

}
