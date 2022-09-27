package 제어문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class Test {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(306, 248);
		
		JButton btnNewButton = new JButton("북쪽");
		btnNewButton.setForeground(new Color(197, 195, 255));
		btnNewButton.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("서쪽");
		btnNewButton_1.setForeground(new Color(197, 195, 255));
		btnNewButton_1.setBackground(new Color(197, 195, 255));
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("가운데");
		btnNewButton_2.setForeground(new Color(197, 195, 255));
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		
		JButton btnNewButton_3 = new JButton("동쪽");
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_3.setForeground(new Color(197, 195, 255));
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("남쪽");
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		btnNewButton_4.setForeground(new Color(197, 195, 255));
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		f.setVisible(true);
	}

}
