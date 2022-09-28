package 순차문;

import java.util.Scanner;

public class ConsoleInputPractice {

	public static void main(String[] args) {
		// Scanner를 새롭게 만들어서
		// 이클립스의 콘솔뷰에서 입력을 받아보자.
		Scanner kb = new Scanner( System.in );
		
		// Scanner는 입력하기 전에 무엇을 입력할지 먼저 프린
		System.out.print("이름을 입력: ");
		String name = kb.next();
		System.out.println("입력받은 이름은 " + name + "입니다.");

		System.out.print("소속을 입력: ");
		String com = kb.next();
		System.out.println("입력받은 소속은 " + com + "입니다.");
		
		kb.close();
	}

}
