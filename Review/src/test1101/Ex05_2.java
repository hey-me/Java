package test1101;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;

public class Ex05_2 {

	public static void main(String[] args) {
		new GridL4();
	}

}
class GridL4 extends JFrame{
	GridL4(){
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
//			jb[i].setBackground(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
//			jb[i].setBackground(new Color(3*i,5*i,100/(i+1)));
			c.add(jb[i]);
		}
		
		setSize(500, 200);
		setVisible(true);
	}
}