package day21.com.ict.edu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex03_Join extends JFrame{
	JPanel jp;
	JButton jb;
		public Ex03_Join() {
			jp = new JPanel();
			jb = new JButton("뒤로가기");
			
			jp.add(jb);
			add(jp);
				
			setLocationRelativeTo(null);
			setSize(500,300);
			//setDefaultCloseOperation(EXIT_ON_CLOSE);// 지우면 메인 혼자꺼짐
			setVisible(true);
			
		}
	
	public static void main(String[] args) {
		new Ex03_Join();
	}
}
