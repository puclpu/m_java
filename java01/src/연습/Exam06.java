package 연습;

import javax.swing.JOptionPane;

public class Exam06 {

	public static void main(String[] args) {
		char pw = 'p';
		String tmp = JOptionPane.showInputDialog("암호를 입력하세요.");
		char pw2 = tmp.charAt(0);
		
		String change = JOptionPane.showInputDialog("어제와 오늘의 몸무게 변화를 입력하세요.");
		double c = Double.parseDouble(change);
		
		if (pw == pw2 && c > 2) {
			JOptionPane.showMessageDialog(null, "성공!");
		}
		else {
			JOptionPane.showMessageDialog(null, "내일 다시 도전!");
		}
	}
	
}
