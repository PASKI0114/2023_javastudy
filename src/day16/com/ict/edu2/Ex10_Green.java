package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Ex10_Green extends JPanel{
	public Ex10_Green() {
		setBackground(Color.GREEN);
		JCheckBox jcb1 = new JCheckBox("1");
		JCheckBox jcb2 = new JCheckBox("2");
		JCheckBox jcb3 = new JCheckBox("3");
		JCheckBox jcb4 = new JCheckBox("4");
		jcb1.setBackground(Color.GREEN);
		jcb2.setBackground(Color.GREEN);
		jcb3.setBackground(Color.GREEN);
		jcb4.setBackground(Color.GREEN);
		ButtonGroup bg = new ButtonGroup();
		add(jcb1);
		add(jcb2);
		add(jcb3);
		add(jcb4);
		
	}
}
