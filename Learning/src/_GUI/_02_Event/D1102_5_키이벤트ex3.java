package _GUI._02_Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import _GUI._02_Event.D1102_5_키이벤트ex1.MyKeyLisner;

public class D1102_5_키이벤트ex3 extends JFrame {

	static final int FLY = 10;

	JLabel la = new JLabel("Hello");//?? 아래클래스확인
	
	public D1102_5_키이벤트ex3() {
		setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기 예제");
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

//		JLabel la; ㅇ여기적으면 제대로 실행안됨.

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
		new D1102_5_키이벤트ex3();
	}

}
