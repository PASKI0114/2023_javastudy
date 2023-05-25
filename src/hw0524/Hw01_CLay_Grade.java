package hw0524;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
public class Hw01_CLay_Grade extends JFrame implements ActionListener{
	Hw01_CLay_Main main;
	JPanel jp1, jp2, jp3, jp4;
	JTextField addname, kor, eng, math;
	JTextArea jta;
	JButton btn1, btn2, btn3, btn4;
	
	public Hw01_CLay_Grade(Hw01_CLay_Main main) {
		this.main = main;
		//super("성적계산");

		
		jp1 = new JPanel();
		addname = new JTextField(10);
		jp1.add(new JLabel("이 름: "));
		jp1.add(addname);

		jp2 = new JPanel();
		kor = new JTextField(10);
		eng = new JTextField(10);
		math = new JTextField(10);
		jp2.add(new JLabel("국  어: "));
		jp2.add(kor);
		jp2.add(new JLabel("영  어: "));
		jp2.add(eng);
		jp2.add(new JLabel("수  학: "));
		jp2.add(math);

		jta = new JTextArea();
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jp3 = new JPanel();
		btn1 = new JButton("저 장");
		btn2 = new JButton("종 료");
		btn3 = new JButton("취 소");
		btn4 = new JButton("뒤 로");
		jp3.add(btn1);
		jp3.add(btn2);
		jp3.add(btn3);
		jp3.add(btn4);

		JPanel jp4 = new JPanel();
		jp4.setLayout(new BorderLayout());
		jp4.add(jp2, BorderLayout.NORTH);
		jp4.add(jsp, BorderLayout.CENTER);
		jp4.add(jp3, BorderLayout.SOUTH);

		add(jp1, BorderLayout.NORTH);
		add(jp4, BorderLayout.CENTER);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 300, ds.height / 2 - 250, 600, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);

		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				main.setVisible(true);
				setVisible(false);
			}
		});
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();
		if(obj == btn1) {
			String name = addname.getText();
			int num1 = Integer.parseInt(kor.getText());
			int num2 = Integer.parseInt(eng.getText());
			int num3 = Integer.parseInt(math.getText());
			int sum = num1 + num2 +num3;
			double avg = ((int) (((double) sum / 3.0) * 10.0)) / 10.0;
		
			jta.append("이름: "+ name + " 국어: " + num1 + " 영어: " + num2 + " 수학: " + num3 +  "\n");
			jta.append("총점: "+ sum + " 평균 " + avg + "\n");
		} else if (obj == btn3) {
			//jta.clearSelection();
			jta.setText("");
		} else if (obj == btn2) {
			System.exit(0);
		}
		
		

		

	
}

	public static void main(String[] args) {
		new Hw01_CLay_Grade(main);
	}
}
