package day18.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex03_grade extends JFrame {
	public Ex03_grade() {
		super("성적계산");

		JPanel jp1 = new JPanel();
		JTextField name = new JTextField(10);
		jp1.add(new JLabel("이 름: "));
		jp1.add(name);
		
		JPanel jp2 = new JPanel();
		JTextField kor = new JTextField(10);
		JTextField eng = new JTextField(10);
		JTextField math = new JTextField(10);
		jp2.add(new JLabel("국  어: "));
		jp2.add(kor);
		jp2.add(new JLabel("영  어: "));
		jp2.add(eng);
		jp2.add(new JLabel("수  학: "));
		jp2.add(math);
		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		JPanel jp3 = new JPanel();
		JButton btn1 = new JButton("저 장");
		JButton btn2 = new JButton("종 료");
		JButton btn3 = new JButton("취 소");
		jp3.add(btn1);
		jp3.add(btn2);
		jp3.add(btn3);
		
		JPanel jp4 = new JPanel();
		jp4.setLayout(new BorderLayout());
		jp4.add(jp2, BorderLayout.NORTH);
		jp4.add(jsp, BorderLayout.CENTER);
		jp4.add(jp3, BorderLayout.SOUTH);
		
		add(jp1,BorderLayout.NORTH);
		add(jp4,BorderLayout.CENTER);
		
		
		// 컴포넌트 크기에 맞춰서
		pack();
		// 화면중간
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex03_grade();
	}
}
