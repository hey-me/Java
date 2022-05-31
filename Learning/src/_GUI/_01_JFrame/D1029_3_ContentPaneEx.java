package _GUI._01_JFrame;

import java.awt.*;
import javax.swing.*;

public class D1029_3_ContentPaneEx extends JFrame {
	
	public D1029_3_ContentPaneEx() {
		setTitle("contentPaneEx");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.orange);
		c.setLayout(new FlowLayout());
		c.add(new JButton("click"));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new D1029_3_ContentPaneEx();
	}

}
