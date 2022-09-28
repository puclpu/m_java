package 연습;

import java.util.Scanner;

public class 인기투표 {

	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in );
		int iu = 0;
		int nj = 0;
		int iv = 0;
		
		while (true) {
			System.out.print("입력(1)아이유, (2)뉴진스, (3)아이브  ");
			int vote = kb.nextInt();
			
			if (vote == 4) {
				System.out.println("종료합니다.");
				System.out.println("아이유: " + iu);
				System.out.println("뉴진스: " +nj);
				System.out.println("아이브: " + iv);
				break;
			} else if (vote == 1) {
				iu++;
			} else if (vote == 2) {
				nj++;
			} else if (vote == 3) {
				iv++;
			}
			else {
				System.out.println("없는 번호입니다.");
			}
			
			
		}
		
		kb.close();
		
	}

}
