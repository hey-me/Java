package _GUI._02_Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import _GUI._02_Event.D1102_5_Ű�̺�Ʈex1.MyKeyLisner;

public class D1102_5_Ű�̺�Ʈex3 extends JFrame {

	static final int FLY = 10;

	JLabel la = new JLabel("Hello");//?? �Ʒ�Ŭ����Ȯ��
	
	public D1102_5_Ű�̺�Ʈex3() {
		setTitle("��,��,��,�� Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		la.setLocation(50, 50);
		la.setSize(50, 50);
		c.setLayout(null);

		c.add(la);
		c.addKeyListener(new MyKeyListener());
		setSize(500, 500);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
		
//		c.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				Component com = (Component)e.getSource();
//				com.setFocusable(true);
//				com.requestFocus();
//			}
//		});

	}

	class MyKeyListener extends KeyAdapter {

//		JLabel la; ������������ ����� ����ȵ�.

		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY() - FLY);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY() + FLY);
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX() + FLY, la.getY());
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX() - FLY, la.getY());
				break;
			}
		}
	}

	public static void main(String[] args) {
		new D1102_5_Ű�̺�Ʈex3();
	}

}
