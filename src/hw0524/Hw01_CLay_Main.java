package hw0524;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import day21.com.ict.edu.Ex03_Join;

public class Hw01_CLay_Main extends JFrame{
	JPanel pg1, card1,card2,card3,card4;
	JButton jb1,jb2,jb3, jb4;
	CardLayout cardLayout;
	//CardLayout cardLayout;
	public Hw01_CLay_Main() {
		super("숙제");
		
		pg1 =new JPanel();
		
		card1 = new JPanel();
		card1.setLayout(new BorderLayout());
		card1.setBackground(Color.GREEN);
		card1.add(new JLabel("첫번째 카드",JLabel.CENTER));
	
		card2 = new JPanel();
		card2.setLayout(new BorderLayout());
		card2.setBackground(Color.BLUE);
		card2.add(new JLabel("두번째 카드",JLabel.CENTER));
		
		card3 = new JPanel();
		card3.setLayout(new BorderLayout());
		card3.setBackground(Color.PINK);
		card3.add(new JLabel("세번째 카드",JLabel.CENTER));
		
		jb1 = new JButton("계산기");
		jb2 = new JButton("성적");
		jb3 = new JButton("나라입력");
		jb4 = new JButton("종료");
		
		cardLayout = new CardLayout();
		pg1.setLayout(cardLayout);
		
		pg1.add(card1);
		pg1.add(card2);
		pg1.add(card3);
		
		card1.add(jb1,jb4);
		card2.add(jb2,jb4);
		card3.add(jb3,jb4);
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
		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new Hw01_CLay_Main();
	}
}
