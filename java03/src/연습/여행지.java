package 연습;

import java.util.Scanner;

public class 여행지 {

	public static void main(String[] args) {
		// p 80
		Scanner kb = new Scanner( System.in );
		
		System.out.println("작년에 가고 싶었던 곳 세곳을 입력하세요.");
		String[] last = new String [3];
		for (int i = 0; i < last.length; i++) {
			last[i] = kb.next();
		}

		int count = 0;
		System.out.println("올해에 가고 싶었던 곳 세곳을 입력하세요.");
		String[] year = new String [3];
		for (int i = 0; i < year.length; i++) {
			year[i] = kb.next();
			
//			for (int j = 0; j < last.length; j++) {
//				if (last[j].equals(year[i])) {
//					count++;
//				}
//			}
			
			if (last[i].equals(year[i])) {
				count++;
			}
		}
		System.out.println(count);
		kb.close();
	}

}
