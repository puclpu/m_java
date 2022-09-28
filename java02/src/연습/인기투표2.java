package 연습;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class 인기투표2 {

	public static void main(String[] args) {

		JPanel f = new JPanel();
		f.setSize(352, 500);
		f.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("2022 신인상");
		lblNewLabel.setBounds(150, 23, 74, 16);
		f.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1.아이브");
		lblNewLabel_1.setBounds(226, 99, 61, 16);
		f.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2.뉴진스");
		lblNewLabel_2.setBounds(226, 208, 61, 16);
		f.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("3.엔믹스");
		lblNewLabel_3.setBounds(226, 321, 61, 16);
		f.add(lblNewLabel_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(226, 141, 53, 16);
		f.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(226, 263, 53, 16);
		f.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(226, 376, 53, 16);
		f.add(textArea_2);
		f.setVisible(true);
	}
}
