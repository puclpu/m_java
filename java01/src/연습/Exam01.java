package 연습;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		String width = JOptionPane.showInputDialog("가로 길이 입력");
		String height = JOptionPane.showInputDialog("세로 길이 입력");
		
		int w = Integer.parseInt(width);
		int h = Integer.parseInt(height);
		int s = w * h;
		
		JOptionPane.showMessageDialog(null, s);
	}

}
