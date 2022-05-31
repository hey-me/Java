package _GUI._01_JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class D1029_6_BorderLayout extends JFrame {
	
	public D1029_6_BorderLayout() {
		setTitle("contentPaneEx");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setBackground(Color.orange);
		c.setLayout(new BorderLayout(10, 40));
		c.add(new JButton("click"), BorderLayout.EAST);
		c.add(new JButton("1"), BorderLayout.SOUTH);
		c.add(new JButton("2"), BorderLayout.WEST);
		c.add(new JButton("3"), BorderLayout.NORTH);
		c.add(new JButton("4"), BorderLayout.CENTER);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new D1029_6_BorderLayout();

	}

}
