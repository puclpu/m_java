package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 정답맞추기 {

	public static void main(String[] args) {
//		int target = 88;
		Random r = new Random();
		int target = r.nextInt(100); // 0~99
		int count = 0;
		int fail = 0;
		while (true) {
			String data = JOptionPane.showInputDialog("생각한 숫자 입력");
			count++; // 증감연산자 (1씩 증가, 1씩 감소)
			int data2 = Integer.parseInt(data);
			if (data2 == target) {
				System.out.println("정답입니다! 정답은 " + target);
				System.out.println(count + "회 시도, " + fail + "회 실패하였습니다.");
//				break;
				System.exit(0); // 프로그램 종료
			} else {
				System.out.print("정답이 아닙니다!");
				fail++;
				// 정답보다 큰지 작은지
				if (data2 < target) {
					System.out.println("정답보다 작아요.");
				}
				else if (data2 > target) {
					System.out.println("정답보다 커요.");
				}
			}
		}
//		JOptionPane.showMessageDialog(null, "다음에 또 방문해주세요.");
	}

}
