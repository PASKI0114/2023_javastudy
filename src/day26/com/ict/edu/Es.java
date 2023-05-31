package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Es extends JFrame {
    JPanel jp;
    JTextArea jta;
    JScrollPane jsp;
    JTextField jtf1;
    JButton jb1;

    public Es() {
        jp = new JPanel();
        jtf1 = new JTextField(30);
        jb1 = new JButton("불러오기");
        jta = new JTextArea();
        jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jp.add(new JLabel("파일 경로 : "));
        jp.add(jtf1);
        jp.add(jb1);

        add(jp, BorderLayout.NORTH);
        add(jsp, BorderLayout.CENTER);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        // 버튼 시작
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pathname = jtf1.getText(); // 가져오기
                File file = new File(pathname);
                // 받기
                FileInputStream fis = null;
                // 버퍼
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    // 배열로 받기
                    byte[] b = bis.readAllBytes(); // 다받아옴

                    // 스트링변경
                    String msg = new String(b);
                    // 출력
                    jta.append(msg);
                } catch (Exception e1) {
                    e1.printStackTrace();
                } finally {
                    try {
                    	//닫겨서 != 처리
                        if (bis != null)
                            bis.close();
                        if (fis != null)
                            fis.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        new Es();
    }
}
