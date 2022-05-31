package _GUI._02_Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class D1102_6_마우스이벤트ex1 extends JFrame {
	
	private JLabel la = new JLabel("No mouse Event");
	
	public D1102_6_마우스이벤트ex1() {
		setTitle("MouseEvent");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		la.setSize(150,150);
		
		c.add(la);
		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setText("MouseReleased("+x+","+y+")");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setText("MousePressed("+x+","+y+")");
				c.setBackground(Color.blue);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();				
				la.setText("MouseExited("+x+","+y+")");
				c.setBackground(Color.yellow);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();	
			}
		});
		
		setSize(500, 500);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new D1102_6_마우스이벤트ex1();
	}

}
