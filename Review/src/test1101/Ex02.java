package test1101;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex02 {

	public static void main(String[] args) {
		new Bl();
	}

}
class Bl extends JFrame{
	Bl(){
		super("BorderLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new BorderLayout(5,7));
		c.add(new JButton("North"),BorderLayout.NORTH);
		c.add(new JButton("West"),BorderLayout.WEST);
		c.add(new JButton("Center"),BorderLayout.CENTER);
		c.add(new JButton("East"),BorderLayout.EAST);
		c.add(new JButton("South"),BorderLayout.SOUTH);
		setSize(400, 200);
		setVisible(true);
		
	}
}