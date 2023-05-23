package day19.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//이벤트 : 사용자가 어떠한 행동, 동작을 하는것을 말한다.
//이벤트 소스: 이벤트가 발생되는 컴포넌트(버튼, 체크박스, .....)
//이벤트리스너 : 이벤트 감자, 이벤트가 발생되면 실제적으로 이벤트를 처리할수있도록
//			 만든 인터페이스
//이벤트 핸들러 : 리스너에 전달된 이벤트를 실제로 처리할수있도록 이벤트 리스너에 
//			  포함되어있는 메서드 (추상메서드)
//			  즉 발생된 이벤트 객체를 받아서 실제적으로 처리해주는 기능을 하는 메서드.

//ActionEvent : 컴포넌트를 눌렀더나, 선택되었을때. Enter 키를 눌렀을때 발생하는 이벤트
//ActionLitsner : actionPerformed() 추상메서드를 가지고있다.
//addActionListner :컴포넌트에 ActionLitsner를 추가해서 이벤트를 감지할수있도록 하는 메서드.

public class Ex02_ActionEvent extends JFrame implements ActionListener {
	JPanel jp;
	JButton jb1, jb2, jb3;

	public Ex02_ActionEvent() {
		super("ActionLitsner");

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
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jb1.addActionListener(new ActionListener() { //모바일에서 많이 쓰는방식

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("입력1눌렀네");

			}
		});
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("입력2눌렀네");
			}
		});
		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

	}

	public static void main(String[] args) {
		new Ex02_ActionEvent();
	}
}
