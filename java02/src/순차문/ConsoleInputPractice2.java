package 순차문;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ConsoleInputPractice2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in );
		
		System.out.print("나이를 입력: ");
		int age = kb.nextInt();		
		kb.close();
		
		int age2 = age + 1;
		System.out.println( "내년 나이는 " + age2);
	}

//		JButton b1 = new JButton();
//		JButton b2 = new JButton();
//		JFrame f = new JFrame();
//		JTextField t1 = new JTextField();
//		JTextArea ja = new JTextArea();
//		Random r = new Random();

}
