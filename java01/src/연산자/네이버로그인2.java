package 연산자;

import javax.swing.JOptionPane;

public class 네이버로그인2 {

	public static void main(String[] args) {
		// db에 저장된 가입할 때의 id/pw
		String id = "root";
		String pw = "pass";
		
		String id2 = JOptionPane.showInputDialog("로그인 id");
		String pw2 = JOptionPane.showInputDialog("로그인 pw");
		
		if ( id.equals(id2) && pw.equals(pw2) ) {
			JOptionPane.showMessageDialog(null, "로그인성공");
		}
		else {
			JOptionPane.showMessageDialog(null, "로그인실패");
		}

	}

}