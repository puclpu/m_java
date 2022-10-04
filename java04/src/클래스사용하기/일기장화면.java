package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 일기장화면 {
	private static JTextField t1;
	private static JTextField t2;
//	private static JTextArea t3;

	//멤버메서드
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void open() {
		JFrame f = new JFrame();
		f.setSize(377, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(56, 83, 91, 24);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(56, 155, 91, 21);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("오늘의 내용");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(56, 226, 91, 24);
		f.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t1.setForeground(new Color(169, 137, 182));
		t1.setBounds(179, 85, 156, 26);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t2.setForeground(new Color(169, 137, 182));
		t2.setBounds(179, 150, 156, 26);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JTextArea t3 = new JTextArea();
		t3.setForeground(new Color(189, 159, 207));
		t3.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		t3.setBounds(179, 217, 156, 135);
		f.getContentPane().add(t3);
		f.setVisible(true);
		
		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				
				// 자바프로그램 밖에 있는 자원들(네트워크, db프로그램, 파일, etc)을 연결할 때는
				// 프로그램이 실행되지 못하는 위험한 상황으로 인식해서
				// 반드시 위험한 상황이 발생하면 어떻게 처리할지를 명시해주어야 한다.
				// try~catch
				
				// file.txt와 자바프로그램간 스트림(연결통로)를 만들어라.
				FileWriter file;
				try {
					file = new FileWriter(s1 + ".txt");
					// 스트림을 통해서 데이터를 보내라.
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					
					// 스트림이 닫힘. 데이터를 다 보냈다고 인식.
					file.close();
					
				} catch (IOException e1) {
					System.out.println("파일 저장 중 에러 발생.");
				}
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnNewButton.setForeground(new Color(129, 111, 134));
		btnNewButton.setBounds(93, 397, 184, 29);
		f.getContentPane().add(btnNewButton);
		
	}

}
