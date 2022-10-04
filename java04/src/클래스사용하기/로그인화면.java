package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인화면 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(377, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디: ");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(58, 257, 81, 21);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(58, 309, 81, 21);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t1.setBounds(183, 254, 130, 26);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t2.setBounds(183, 304, 130, 26);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				if (s1.equals("root") && s2.equals("1234")) {
					
					// 일기쓰기화면창을 띄워라.
					일기장화면 diary = new 일기장화면();
					// 일기장화면 diary = new 일기장화면();
					diary.open();
				}
				else {
					JOptionPane.showMessageDialog(f, "입력값이 달라 로그인 실패입니다.");
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("/Users/kimchaerin/2022/eclipse-workspace/java04/문.jpeg"));
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		btnNewButton.setBounds(44, 368, 117, 71);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("/Users/kimchaerin/2022/eclipse-workspace/java04/지우개.jpeg"));
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		btnNewButton_1.setForeground(new Color(231, 33, 2));
		btnNewButton_1.setBounds(216, 368, 117, 71);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/kimchaerin/2022/eclipse-workspace/java04/일기장.jpeg"));
		lblNewLabel_2.setBounds(32, 36, 318, 185);
		f.getContentPane().add(lblNewLabel_2);
		f.setVisible(true);
	}
}
