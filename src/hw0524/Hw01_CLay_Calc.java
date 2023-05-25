package hw0524;


	import java.awt.BorderLayout;
	import java.awt.Dimension;
	import java.awt.Toolkit;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.ItemEvent;
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

	public class Hw01_CLay_Calc extends JFrame implements ActionListener, ItemListener {
		Hw01_CLay_Main main;
		JPanel jp1, jp2;
		JTextField jtf1, jtf2;
		JRadioButton jrb1, jrb2, jrb3, jrb4;
		JTextArea jta;
		JScrollPane jsp;
		JButton calc, exit, clear, back;
		ButtonGroup bg;

		public Hw01_CLay_Calc(Hw01_CLay_Main main) {
			this.main = main;
			//super("계산기");

			jp1 = new JPanel();
			jtf1 = new JTextField(5);
			jtf2 = new JTextField(5);

			jp1.add(new JLabel("수1: "));
			jp1.add(jtf1);
			jp1.add(new JLabel("수2: "));
			jp1.add(jtf2);
			jp1.add(new JLabel("연산자: "));

			// 라디오
			jrb1 = new JRadioButton(" + ");
			jrb2 = new JRadioButton(" - ");
			jrb3 = new JRadioButton(" * ");
			jrb4 = new JRadioButton(" / ");

			bg = new ButtonGroup();
			bg.add(jrb1);
			bg.add(jrb2);
			bg.add(jrb3);
			bg.add(jrb4);

			jp1.add(jrb4);
			jp1.add(jrb1);
			jp1.add(jrb2);
			jp1.add(jrb3);

			jta = new JTextArea();
			jta.setLineWrap(true);
			jta.setEditable(false);
			jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
					ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

			jp2 = new JPanel();
			calc = new JButton("계 산");
			exit = new JButton("종 료");
			clear = new JButton("취 소");
			back = new JButton("뒤 로");

			jp2.add(calc);
			jp2.add(exit);
			jp2.add(clear);
			jp2.add(back);

			add(jp1, BorderLayout.NORTH);
			add(jta, BorderLayout.CENTER);
			add(jp2, BorderLayout.SOUTH);

			Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
			setBounds(ds.width / 2 - 200, ds.height / 2 - 250, 400, 500);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

			jrb1.addItemListener(this);
			jrb2.addItemListener(this);
			jrb3.addItemListener(this);
			jrb4.addItemListener(this);

			calc.addActionListener(this);
			exit.addActionListener(this);
			clear.addActionListener(this);
		//	back.addActionListener(this);

			
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					main.setVisible(true);
					setVisible(false);
				}
			});
		}
		

		// 라디오 버튼
		@Override
		public void itemStateChanged(ItemEvent e) {
			JRadioButton obj = (JRadioButton) e.getSource();
			// if(e.getStateChange() == e.SELECTED) {
			// jta.append(obj.getText() + " 선택\n");
			// }

		}

		// 버튼 처리
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton obj = (JButton) e.getSource();
			if (obj == exit) {
				System.exit(0);
			} else if (obj == clear) {
				bg.clearSelection();
				jta.setText("");

				// 결과버튼
			} else if (obj == calc) {

				if (jrb1.isSelected()) {
					int num1 = Integer.parseInt(jtf1.getText());
					int num2 = Integer.parseInt(jtf2.getText());
					int sum = num1 + num2;
					jta.append(num1 + " + " + num2 + " = " + sum + "\n");
				} else if (jrb2.isSelected()) {
					int num1 = Integer.parseInt(jtf1.getText());
					int num2 = Integer.parseInt(jtf2.getText());
					int sub = num1 - num2;
					jta.append(num1 + " - " + num2 + " = " + sub + "\n");
				} else if (jrb3.isSelected()) {
					int num1 = Integer.parseInt(jtf1.getText());
					int num2 = Integer.parseInt(jtf2.getText());
					int mul = num1 * num2;
					jta.append(num1 + " * " + num2 + " = " + mul + "\n");
				} else if (jrb4.isSelected()) {
					int num1 = Integer.parseInt(jtf1.getText());
					int num2 = Integer.parseInt(jtf2.getText());
					double div = ((int) (num1 * 10.0 / num2)) / 10.0;
					jta.append(num1 + " / " + num2 + " = " + div + "\n");
				}

			}
		}

		public static void main(String[] args) {
			new Hw01_CLay_Calc(main);
		}
	}
