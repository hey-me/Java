package _GUI._02_Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class D1102_4_마우스어댑터ex extends JFrame {
	Label la = new Label("Hello");

	public D1102_4_마우스어댑터ex() {
		setTitle("MouseAdapter 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30, 30);

		c.add(la).addMouseListener(new MyMouseAdapter());

		setSize(500, 500);
		setVisible(true);
		
//		c.setFocusable(true);
//		c.requestFocus();
	}

	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);  
		}
	}

	public static void main(String[] args) {
		new D1102_4_마우스어댑터ex();
	}

}
