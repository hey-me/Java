package _GUI._02_Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class D1101_2_�̺�Ʈ�׼Ǹ�����ex_����Ŭ���� extends JFrame {

	public D1101_2_�̺�Ʈ�׼Ǹ�����ex_����Ŭ����() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
//		btn.addActionListener(new ActionListener()){
//			
//		};
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new D1101_2_�̺�Ʈ�׼Ǹ�����ex_����Ŭ����();
	}

}

class MyActionListener implements ActionListener{
	@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if (b.getText().equals("Action")) {
				b.setText("�׼�");
			} else {
				b.setText("Action");
			}
		}	
	
}
