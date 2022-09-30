package 배열응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범만들기 {

	// 전체 영역에서 특정한 변수를 사용하려면 클래스 아래에 선언
	static int start = 0; // 전역변
	
	public static void main(String[] args) {
		// 영화
		String[] title = {"인생은아름다워","정직한후보2","헌트","헤어질결심","공조2"};
		// 포스터파일(파일이름)
		String[] img = {"인생은아름다워.jpeg","정직한후보.jpeg","헌트.jpeg","헤어질결심.jpeg","공조.jpeg"};
		// 평점
		double[] jumsu = {8.83, 7.85, 8.50, 8.95, 8.03};

		JFrame f = new JFrame();
		f.setSize(457, 423);
		
		JLabel top = new JLabel("인생은아름다워");
		top.setForeground(new Color(69, 235, 10));
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel("");
		ImageIcon icon = new ImageIcon(img[0]);
		center.setIcon(icon);
		f.getContentPane().add(center, BorderLayout.CENTER);
		
		JLabel under = new JLabel("8.83");
		under.setForeground(new Color(69, 235, 10));
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		f.getContentPane().add(under, BorderLayout.SOUTH);
		
		JButton left = new JButton("<<");
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// << 버튼을 클릭했을 때 처리하고 싶은 내용이 있으면,
				// actionPerformed()메서드에 넣으세요
				// 제목이 표시된 라벨에 제목을 변경해야 함.
				start = start - 1;
				if (start > -1) {
					
					top.setText(title[start]);
					under.setText(jumsu[start]+"점");
					
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				}
				else {
					JOptionPane.showMessageDialog(f, "왼쪽 끝입니다.");
				}

			}
		});
		left.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		f.getContentPane().add(left, BorderLayout.WEST);
		
		JButton right = new JButton(">>");
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start = start + 1;
				if (start < 5) {
					
					top.setText(title[start]);
					under.setText(jumsu[start]+"점");
					
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				}
				else {
					JOptionPane.showMessageDialog(f, "오른쪽 끝입니다.");
				}
			}
		});
		right.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		f.getContentPane().add(right, BorderLayout.EAST);
		f.setVisible(true);
	}

}
