package 연산자;

import javax.swing.JOptionPane;

public class 내년나이계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력
		String age = JOptionPane.showInputDialog("올해 나이 입력");
		
		// 처리
		int age2 = Integer.parseInt(age);
		age2 += 1;

		// 출력
		JOptionPane.showMessageDialog(null, "내년 나이는 " + age2);

	}

}
