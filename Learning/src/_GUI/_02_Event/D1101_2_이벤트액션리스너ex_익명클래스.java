package _GUI._02_Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class D1101_2_�̺�Ʈ�׼Ǹ�����ex_�͸�Ŭ���� extends JFrame {

	public D1101_2_�̺�Ʈ�׼Ǹ�����ex_�͸�Ŭ����() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
//				if (b.getBackground() == Color.red) {
//					b.setBackground(Color.cyan);
//				} else {
//					b.setBackground(Color.red);
//				}
				Container c = b.getParent();
				c.setBackground(Color.green);
			}
		});
		c.add(btn);

		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new D1101_2_�̺�Ʈ�׼Ǹ�����ex_�͸�Ŭ����();
	}

}
