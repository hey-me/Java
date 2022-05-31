package _GUI._02_Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class D1102_3_마우스리스너ex2 extends JFrame {
	
	public D1102_3_마우스리스너ex2() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		Label la =new Label("Hello");
		la.setSize(30,30);
		la.setLocation(30, 30);
		c.addMouseListener(new MouseListener() {
			
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
		c.add(la);
		
		setSize(500,500);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new D1102_3_마우스리스너ex2();
	}

}