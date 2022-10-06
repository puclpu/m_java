package 상속활용;

import java.awt.BorderLayout;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드사용2 extends JFrame {

	JLabel img_label, day_label;
	시각스레드2 day_thr;
	이미지스레드2 img_thr;
	static 스레드사용2 f;

	public 스레드사용2() {
		setSize(1000, 550);
		img_label = new JLabel("");
		day_label = new JLabel("day");
		add(img_label, BorderLayout.WEST);
		add(day_label, BorderLayout.EAST);

		setVisible(true);

		img_thr = new 이미지스레드2();
		day_thr = new 시각스레드2();
		img_thr.start();
		day_thr.start();
	}

	public static void main(String[] args) {
		f = new 스레드사용2();
	}

	public class 이미지스레드2 extends Thread {
		@Override
		public void run() {
			String[] img = { "토.jpeg", "햄.jpeg", "강.jpeg", "고.jpeg" };
			for (int i = 0; i < img.length; i++) {
				ImageIcon icon = new ImageIcon(img[i]);
				img_label.setIcon(icon);
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (i == img.length - 1) {
					JOptionPane.showMessageDialog(f, "사진이 끝났습니다.");
					day_thr.stop();
				}
			}
		}
	}

	public class 시각스레드2 extends Thread {
		@Override
		public void run() {
			for (int i = 10; i > 0; i++) {
				Date date = new Date();
				day_label.setText(date + "");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
