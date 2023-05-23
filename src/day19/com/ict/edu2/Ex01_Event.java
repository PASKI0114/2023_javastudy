package day19.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex01_Event extends JFrame implements ActionListener {

	JPanel jp;
	JButton jb1, jb2, jb3;

	public Ex01_Event() {
		super("ActionListener");

		jp = new JPanel();
		jb1 = new JButton("입력1");
		jb2 = new JButton("입력2");
		jb3 = new JButton("EXIT");

		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);

		add(jp);
		pack();
		setLocationRelativeTo(null);

		//Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		//setBounds(ds.width / 2 - 200, ds.height / 2 - 250, 400, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 이벤트 소스에 ActionListener를 붙이자.
		// this를 사용한 이유 => 현재 객체에 ActionListener가 있다.
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();
		if (obj == jb1) {
			System.out.println("입력1이 눌렸네");
		} else if (obj == jb2) {
			System.out.println("입력2가 눌렸네");
		} else if (obj == jb3) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new Ex01_Event();
	}
}
