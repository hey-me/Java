package test1101;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class Ex01 {

	public static void main(String[] args) {
		new sFrame();
	}

}

class sFrame extends JFrame{
	sFrame(){
		Container c=getContentPane();
		setTitle("ÀÚ¹Ù ½ºÀ®");
		setSize(400, 200);
		c.setBackground(Color.cyan);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}