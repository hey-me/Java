package _GUI._03_����������Ʈ;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class D1104_08_�ؽ�Ʈ����ex extends JFrame {

	private JTextField tf = new JTextField(20);	
	private JTextArea ta = new JTextArea(7, 20);
	
	public D1104_08_�ؽ�Ʈ����ex() {
		setTitle("�ؽ�Ʈ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�Է� �� <Enter>Ű�� �Է��ϼ���"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText()+"Wn");
				t.setText("");
				
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new D1104_08_�ؽ�Ʈ����ex();
	}

}
