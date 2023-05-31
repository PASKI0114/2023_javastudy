package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Hw_0531 extends JFrame {
		//�ʿ��Ѱ�
	JPanel pg1,pg2,jp1,jp2,jp3,jp4;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	JLabel idLabel,nameLabel,addrLabel,phoneLabel;
	JTextField idField,nameField,addrField,phoneField;
	JTextArea jta;
	JScrollPane jsp;
	public Hw_0531() {
		super("DB 연동 정보");
		//����Ʈ
		
		pg1 = new JPanel(new GridLayout(4,1));
		pg2 = new JPanel();
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp4 = new JPanel();
		idLabel = new JLabel("CUSTID :");
		nameLabel = new JLabel("NAME :");
		addrLabel = new JLabel("ADDRESS :");
		phoneLabel = new JLabel("PHONE :");
		
		idField = new JTextField(30);
		nameField = new JTextField(30);
		addrField = new JTextField(30);
		phoneField = new JTextField(30);
		
		
		jta = new JTextArea(5,10);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jta.setLineWrap(true);
        jta.setEditable(false);
        
        jb1 = new JButton("전체보기");
        jb2 = new JButton("삽입");
        jb3 = new JButton("삭제");
        jb4 = new JButton("검색");
        jb5 = new JButton("불러오기");
        jb6 = new JButton("고치기");
        
        jp1.setLayout(new FlowLayout(FlowLayout.RIGHT));	
        jp1.add(idLabel);
        jp1.add(idField);
        jp2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        jp2.add(nameLabel);
        jp2.add(nameField);
        jp3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        jp3.add(addrLabel);
        jp3.add(addrField);
        jp4.setLayout(new FlowLayout(FlowLayout.RIGHT));
        jp4.add(phoneLabel);
        jp4.add(phoneField);
        
        pg1.add(jp1);
        pg1.add(jp2);
        pg1.add(jp3);
        pg1.add(jp4);
        
        pg2.add(jb1);
        pg2.add(jb2);
        pg2.add(jb3);
        pg2.add(jb4);
        pg2.add(jb5);
        pg2.add(jb6);
        
        
        add(pg1,BorderLayout.NORTH);
        add(jsp,BorderLayout.CENTER);
        add(pg2,BorderLayout.SOUTH);
        
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Hw_0531();
	}
}
