package 배열응용;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 200);
		
		String[] header = {"a", "b", "c"};
		String[][] contents = {
				{ "1", "2", "3" },
				{ "1", "2", "3" },
				{ "1", "2", "3" },
				{ "1", "2", "3" },
				{ "1", "2", "3" },
				{ "1", "2", "3" },
				{ "1", "2", "3" },
				{ "1", "2", "3" },
				{ "1", "2", "3" }
		};
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		f.setVisible(true);		
		
		// 이중for
		// contents.length : 1차원 배열의 개수 (9개)
		for (int i = 0; i < contents.length; i++) {
			// contnets[i].length : 열의 개
			for (int j = 0;  j < contents[i].length; j++) {
				System.out.print(contents[i][j] + " ");
			}
			System.out.println();
		}
	}

}
