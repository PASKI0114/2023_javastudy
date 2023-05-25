package hw0524;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import day21.com.ict.edu.Ex03_Join;

public class Hw01_CLay_Main extends JFrame{
	JPanel pg1;
	JButton jb1,jb2,jb3;
	//CardLayout cardLayout;
	public Hw01_CLay_Main() {
		super("숙제");
		pg1 =new JPanel();
		jb1 = new JButton("계산기");
		jb2 = new JButton("성적");
		jb3 = new JButton("나라입력");
		
	
		
		
		pg1.add(jb1);
		pg1.add(jb2);
		pg1.add(jb3);
		add(pg1);
		
		setSize(500,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Hw01_CLay_Calc(Hw01_CLay_Main.this);
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Hw01_CLay_Grade(Hw01_CLay_Main.this);
			}
		});
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Hw01_CLay_Country(Hw01_CLay_Main.this);
			}
		});
	}
	public static void main(String[] args) {
		new Hw01_CLay_Main();
	}
}
