package _GUI._02_Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class D1102_6_���콺�̺�Ʈex2 extends JFrame {

	public D1102_6_���콺�̺�Ʈex2() {
		setTitle("����Ŭ�� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		setSize(500,500);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount()==2) {
				Component c = (Component)e.getSource();
				c.setBackground( new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
			}
		}
	}
	public static void main(String[] args) {
		new D1102_6_���콺�̺�Ʈex2();
	}

}
