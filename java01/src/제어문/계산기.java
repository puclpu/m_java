package 제어문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기 {
	private static JTextField p1;
	private static JTextField p2;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(37, 69, 250));
		lblNewLabel.setBounds(135, 228, 61, 36);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setForeground(new Color(37, 69, 250));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(135, 276, 61, 36);
		f.getContentPane().add(lblNewLabel_1);
		
		p1 = new JTextField();
		p1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		p1.setBounds(225, 233, 138, 26);
		f.getContentPane().add(p1);
		p1.setColumns(10);
		
		p2 = new JTextField();
		p2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		p2.setColumns(10);
		p2.setBounds(225, 281, 138, 26);
		f.getContentPane().add(p2);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			// 버튼을 클릭했을 때 ActionPerformed() 함수가 사용되도록 규칙이 설정되어 있음.
			public void actionPerformed(ActionEvent e) {
				//  plus 버튼을 눌렀을 때 처리하고 싶은 내용 입력.
				JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요!");
				String n1 = p1.getText();
				String n2 = p2.getText();
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				int result = n11 + n22;
				
//				JOptionPane.showMessageDialog(f, result);
				f.setTitle("더한 결과는 " + result);
				
				p1.setText("");
				p2.setText("");
				
				p1.setForeground(Color.red);
			}
		});
		plus.setBounds(112, 335, 117, 53);
		f.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(minus, "마이너스 버튼을 누르셨군요!");
				String n1 = p1.getText();
				String n2 = p2.getText();
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				int result = n11 - n22;
//				JOptionPane.showMessageDialog(f, result);
			}
		});
		minus.setBounds(253, 335, 117, 53);
		f.getContentPane().add(minus);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("/Users/kimchaerin/2022/web-workspace/day01/img/go.png"));
		btnNewButton_2.setBounds(6, 6, 488, 189);
		f.getContentPane().add(btnNewButton_2);
		
		JButton mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				String n1 = p1.getText();
//				String n2 = p2.getText();
//				int n11 = Integer.parseInt(n1);
//				int n22 = Integer.parseInt(n1);
//				
			}
		});
		mul.setBounds(112, 400, 117, 53);
		f.getContentPane().add(mul);
		
		JButton div = new JButton("/");
		div.setBounds(253, 400, 117, 53);
		f.getContentPane().add(div);
		f.setVisible(true);
	}

}
