package 연습;

import java.util.Scanner;

public class 숫자크기비교 {

	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in );
		
		char xo = 'o';
		int f = 0;
		int b = 0;
		
		while (true) {
			System.out.print("숫자입력1>> ");
			int n1 = kb.nextInt();
			System.out.print("숫자입력2>> ");
			int n2 = kb.nextInt();
			if (n1 < n2) {
				System.out.println("뒷 숫자가 더 큽니다.");
				b++;
			} else if (n1 > n2) {
				System.out.println("앞 숫자가 더 큽니다.");
				f++;
			} else {
				System.out.println("두 수가 같습니다.");
			}
			System.out.print("종료할까요?(x) 계속할까요?(o) ");
			String tmp = kb.next();
			xo = tmp.charAt(0);
			if (xo == 'x') {
				System.out.println("앞 숫자가 더 큰 횟수 " + f);
				System.out.println("뒷 숫자가 더 큰 횟수 " + b);
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		kb.close();
	}

}
