package _GUI._01_JFrame;

import java.awt.*;
import javax.swing.*;

public class D1029_5_Flowlayout extends JFrame {

	public D1029_5_Flowlayout() {
		setTitle("contentPaneEx");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setBackground(Color.orange);
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,50));
		
		c.add(new JButton("click"));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new D1029_5_Flowlayout();
	}

}
