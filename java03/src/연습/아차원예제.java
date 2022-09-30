package 연습;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 아차원예제 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 200);
		
		String[] header = { "컴퓨터", "영어", "수학", "체육" };
		String[][] contents = {
				{"100", "88", "99", "77"},
				{"60", "87", "79", "78"},
				{"90", "83", "89", "79"},
				{"100", "88", "99", "77"},
				{"100", "88", "99", "77"},
				{"60", "87", "79", "78"},
				{"90", "83", "89", "79"},
				{"100", "88", "99", "77"},
				{"100", "88", "99", "77"},
				{"60", "87", "79", "78"},
				{"90", "83", "89", "79"},
				{"100", "88", "99", "77"},
				{"100", "88", "99", "77"},
				{"60", "87", "79", "78"},
				{"90", "83", "89", "79"},
				{"100", "88", "99", "77"},
				{"100", "88", "79", "78"},
				{"60", "88", "89", "79"},
				{"90", "88", "99", "77"},
				{"60", "87", "79", "78"},
				{"90", "83", "89", "79"},
				{"80", "86", "99", "77"}
		};
		// [행][열]
		contents[0][0] = "999";
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		f.setVisible(true);
		
	}

}
