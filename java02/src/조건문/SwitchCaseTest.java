package 조건문;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// 정수(long x), 문자1(char), 문자열(String)
		String name = "자바";
		
		// 자체 break 기능이 없어서, 프로그래머가 써주어야함.
		
		switch (name) {
		case "자바":
			System.out.println("1103호로!");
			break;
			
		case "파이썬":
			System.out.println("1104호로!");
			break;

		case "리눅스":
			System.out.println("1102호로!");
			break;

			
		default: // else와 동일! 생략 가능
			System.out.println("카운터로가세요.");
			break;
		}
	}

}
