package test1101;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex05 {

	public static void main(String[] args) {
		new GridL3();
	}

}

class GridL3 extends JFrame{
	GridL3(){
		super("4*4 Color Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new GridLayout(4, 4));
		JButton[] jb=new JButton[16];
		for (int i = 0; i <= 15; i++) {
			jb[i]=new JButton(Integer.toString(i));
		}
		Random r=new Random();
		for (int i = 0; i < jb.length; i++) {
			jb[i].setBackground(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
			c.add(jb[i]);
		}
		
		setSize(500, 200);
		setVisible(true);
	}
}