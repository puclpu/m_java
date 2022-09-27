package 제어문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class 나의두번째윈도우 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(500, 402);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(34, 54, 61, 24);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField.setForeground(new Color(197, 195, 255));
		textField.setBounds(132, 49, 275, 35);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("전화번호");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(34, 124, 97, 24);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("주소");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(34, 187, 61, 24);
		f.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(197, 195, 255));
		textField_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(132, 119, 275, 35);
		f.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(197, 195, 255));
		textField_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(132, 182, 275, 35);
		f.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBounds(174, 293, 117, 29);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(321, 293, 117, 29);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);
	}
}
