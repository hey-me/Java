package _GUI._03_����������Ʈ;

import java.awt.*;
import javax.swing.*;

public class D1103_03_��ư������Ʈex1 extends JFrame {

	public D1103_03_��ư������Ʈex1() {
		setTitle("");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverlIcon = new ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");
		
		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverlIcon);
		
		c.add(btn);
		setSize(250, 150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new D1103_03_��ư������Ʈex1();
	}

}
