package 연습;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exam09 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(323, 500);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(137, 53, 130, 26);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(137, 162, 130, 26);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(137, 278, 130, 26);
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(137, 316, 130, 26);
		f.getContentPane().add(t4);
		t4.setColumns(10);
		
		JButton b1 = new JButton("어디로 갈까?");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				if ( s1.equals("아메리카노") || s1.equals("초코라떼") || s1.equals("자몽허니블랙티") ) {
					JOptionPane.showMessageDialog(f, "카페로 가세요.");
				}
				else {
					JOptionPane.showMessageDialog(f, "물 드세요.");
				}
			}
		});
		b1.setBounds(100, 91, 117, 29);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("나의 내년 나이는?");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				int s22 = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(f, "내년에 " + (s22 + 1) + "살 입니다.");
			}
		});
		b2.setBounds(100, 199, 117, 29);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("두과목 점수의 평균은?");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t3.getText();
				String s4 = t4.getText();
				int s33 = Integer.parseInt(s3);
				int s44 = Integer.parseInt(s4);
				double avg = (s33 + s44) / 2.0;
				JOptionPane.showMessageDialog(f, avg + "점입니다.");
			}
		});
		b3.setBounds(90, 360, 150, 29);
		f.getContentPane().add(b3);
		
		JLabel lblNewLabel = new JLabel("먹고싶은음식");
		lblNewLabel.setBounds(36, 58, 89, 16);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("당신의나이는");
		lblNewLabel_1.setBounds(36, 167, 89, 16);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("국어점수");
		lblNewLabel_2.setBounds(36, 283, 61, 16);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("수학점수");
		lblNewLabel_3.setBounds(36, 321, 61, 16);
		f.getContentPane().add(lblNewLabel_3);
		f.setVisible(true);
	}

}
