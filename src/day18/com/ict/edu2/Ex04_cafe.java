package day18.com.ict.edu2;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ex04_cafe {
	public Ex04_cafe() {
		super();
		
		JPanel jp2 = new JPanel();
		JRadioButton jrb1 = JRadioButton("1");
		JRadioButton jrb2 = JRadioButton("2");
		JRadioButton jrb3 = JRadioButton("13");
		JRadioButton jrb4 = JRadioButton("4");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);
		jp2.add(jrb4);
		
		JPanel jp3 = new JPanel();
		JTextField su = new JTextField(10); 
		JTextField input = new JTextField(10); 
		
		
		JPanel jp4 = new JPanel();
		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		
		jp4.add(jb1);
		jp4.add(jb2);
		jp4.add(jb3);
		
		JPanel pg1 = new JPanel();
		JPanel pg2 = new JPanel();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	private javax.swing.JRadioButton JRadioButton(String string) {
		// TODO Auto-generated method stub
		return null;
	}



	private JRadioButton JRadioButton() {
		// TODO Auto-generated method stub
		return null;
	}



	public static void main(String[] args) {
		new Ex04_cafe();
	}
}
