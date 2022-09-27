package 연습;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("키를 입력하세요");
		double h = Double.parseDouble(height);
		
		double w = (h - 100) * 0.9;
		
		JOptionPane.showMessageDialog(null, w);
		
	}

}
