package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class Ex05_Toggle extends JFrame {
	
	public Ex05_Toggle() {
		super("토글버튼");
		
		JPanel jp = new JPanel();
		
		JToggleButton jtb1 = new JToggleButton();
		jtb1.setText("야구");
		jtb1.setSelected(true);
		
		JRadioButton jtb2 = new JRadioButton("축구");
		JRadioButton jtb3 = new JRadioButton("농구", true);
		JRadioButton jtb4 = new JRadioButton("배구");
		

		jp.add(jtb1);
		jp.add(jtb2);
		jp.add(jtb3);
		jp.add(jtb4);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-300, 500, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex05_Toggle();
	}
}
