package day22.com.ict.edu;

import javax.swing.JFrame;

public class Ex03_Main extends JFrame {
	public Ex03_Main() {
		super("canvas");
		
		add(new Ex03_Canvas());
		setLocationRelativeTo(null);
		setSize(1000,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex03_Main();
	}
}
