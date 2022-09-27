package 제어문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class 나의첫윈도우 {
	private static JTextField textField;

	public static void main(String[] args) {
		// 1. jframe 부품을 새로 만들어주자.
		JFrame f = new JFrame();
		
		// 2. 새로 만든 부푼의 크기를 결정.
		f.setSize(571, 634);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("/Users/kimchaerin/2022/eclipse-workspace/java01/IMG_3498.JPG"));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		textField = new JTextField();
		f.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("가나다라마바사아자파카타파하");
		f.getContentPane().add(textArea, BorderLayout.CENTER);
		
		// 3. 새로 만든 부품 "보여주세요" 설정.
		f.setVisible(true);
	}

}
