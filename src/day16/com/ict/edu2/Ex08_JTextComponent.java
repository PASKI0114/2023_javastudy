package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;

public class Ex08_JTextComponent extends JFrame {
	public Ex08_JTextComponent() {
		super();
		
		JPanel jp = new JPanel();
		
		//JLabel : 글자를 표시한다. 수정불가
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("I D : ");
		
		JLabel jLabel2 = new JLabel("P W : ");
		JLabel jLabel3 = new JLabel("자소서");
		
		//한줄글자입력 : JTextField
		JTextField jtf1 = new JTextField();
		jtf1.setText("아이디 입력");
		jtf1.setColumns(20);//보이는 글자길이
		
		
		
		//JTextField jtf2 = new JTextField("비번입력", 20);
		//입력된 글자가 *******표시되기위해서 JPasswordFeild
		JPasswordField jtf2 = new JPasswordField("비번입력",20);
		
		//메모장과 같이 여러줄 글자입혁: JTextArea(행, 열):
		JTextArea jta = new JTextArea(5, 20);
		
		//자동 줄바꿈
		jta.setLineWrap(true);
		
		//스크롤기능
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,//세로
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER//가로
				);
		
		jp.add(jLabel1);
		jp.add(jtf1);
		jp.add(jLabel2);
		jp.add(jtf2);
		jp.add(jLabel3);
		jp.add(jta);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-200, ds.height/2-150, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex08_JTextComponent();
	}
}
