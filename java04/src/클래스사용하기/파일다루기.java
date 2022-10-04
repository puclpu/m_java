package 클래스사용하기;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일다루기 {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("날짜입력: ");
		String s2 = JOptionPane.showInputDialog("제목입력: ");
		String s3 = JOptionPane.showInputDialog("내용입력: ");
		
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
			
		} catch (IOException e) {
			System.out.println("파일 저장 중 에러 발생.");
		}
		
	}

}
