package _GUI._02_Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class D1102_3_���콺������ex1 extends JFrame {
	
	public D1102_3_���콺������ex1() {
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		Label la =new Label("Hello");
		la.setLocation(10, 10);
		
		c.add(la).addMouseListener(new MouseListener() { //addmouse�� ��� ����? c��? add��?
			
			@Override
			public void mouseReleased(MouseEvent e) {			}
			@Override
			public void mousePressed(MouseEvent e) {			}
			@Override
			public void mouseExited(MouseEvent e) {			}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);
			}
		});
		setSize(500,500);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new D1102_3_���콺������ex2();
	}

}
