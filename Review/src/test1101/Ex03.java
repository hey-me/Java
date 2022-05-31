package test1101;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex03 {

	public static void main(String[] args) {
		new GridL();
	}

}

class GridL extends JFrame{
	GridL(){
		super("GridLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new GridLayout());
		for (int i = 1; i <= 10; i++) {
			c.add(new JButton(Integer.toString(i)));
		}
		setSize(500,200);
		setVisible(true);
	}
}