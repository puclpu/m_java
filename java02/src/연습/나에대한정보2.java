package 연습;

import java.util.Scanner;

public class 나에대한정보2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in );
		
		System.out.print("나의 이름은? ");
		String name = kb.next();
		
		System.out.print("나의 키는? ");
		double height = kb.nextDouble();
		
		System.out.print("나의 몸무게는? ");
		double weight = kb.nextDouble();
		
		System.out.print("나는 저녁을 먹었나요? ");
		boolean dinner = kb.nextBoolean();
		
		System.out.print("나의 좌우명은? ");
		kb.nextLine();
		String life = kb.nextLine();
		
		kb.close();
		
		System.out.println("----------------------");
		System.out.println("내 이름은 " + name + "입니다.");
		System.out.println("내 내년 키는 " + (height + 10) + "입니다.");
		System.out.println("내 내년 몸무게는 " + (weight - 10) + "입니다.");
		System.out.println("나는 저녁을 " + dinner + "했습니다.");
		System.out.println("나의 좌우명은 " + life + "입니다.");
	}

}
