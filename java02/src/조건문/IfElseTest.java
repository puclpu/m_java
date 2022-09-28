package 조건문;

public class IfElseTest {

	public static void main(String[] args) {
		int jumsu = 88;
		String result = ""; // 초기화
		
		// 변수를 선언할 때는 초기값을 넣으세요
		// 조건이 맞으면 브레이크

		if (jumsu >= 90) {
			result = "A"; 
		}
		else if (jumsu >= 80) {
			result = "B";
		}
		else if (jumsu >= 70) {
			result = "C";
		}
		else if (jumsu >= 60) {
			result = "D";
		}
		else {
			result = "F";
		}
	}

}
