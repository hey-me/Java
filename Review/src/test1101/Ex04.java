package test1101;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex04 {

	public static void main(String[] args) {
		new GridL2();
	}

}
class GridL2 extends JFrame{
	GridL2(){
		super("GridLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new GridLayout());
		JButton[] jb=new JButton[10];
		for (int i = 0; i <10; i++) {
			jb[i]=new JButton(Integer.toString(i+1));
		}
		jb[1].setBackground(Color.YELLOW);
		jb[2].setBackground(Color.CYAN);
		jb[3].setBackground(Color.BLACK);
		jb[4].setBackground(Color.LIGHT_GRAY);
		jb[5].setBackground(Color.GREEN);
		jb[6].setBackground(Color.GRAY);
		jb[7].setBackground(Color.PINK);
		jb[8].setBackground(Color.ORANGE);
		jb[9].setBackground(Color.MAGENTA);
		jb[0].setBackground(Color.red);
		for (int i = 0; i < jb.length; i++) {
			c.add(jb[i]);
		}
//		c.add(new JButton("2"), getColorModel());
		
		setSize(500,200);
		setVisible(true);
	}
}