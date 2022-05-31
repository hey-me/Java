package _GUI._02_Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class D1102_5_Ű�̺�Ʈex2 extends JFrame {
	
	private JLabel la = new JLabel();
	
	public D1102_5_Ű�̺�Ʈex2() {
		setTitle("KeyCode ���� : F1Ű : �ʷϻ�, %Ű: �����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode()));
			
			if (e.getKeyChar() == '%') {
				getContentPane().setBackground(Color.yellow);
			} else if (e.getKeyCode()== KeyEvent.VK_F1){
				getContentPane().setBackground(Color.green);
			}
		}
	}
	
	
	public static void main(String[] args) {
		new D1102_5_Ű�̺�Ʈex2();
	}

}
