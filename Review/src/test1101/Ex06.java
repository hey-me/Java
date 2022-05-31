package test1101;

import java.awt.Color;
import java.awt.Container;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex06 {

	public static void main(String[] args) {
		new JLabelex();
	}

}
class JLabelex extends JFrame{
	JLabelex(){
		super("Random JLabels");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		JLabel[]jl=new JLabel[20];
		
		for (int i = 0; i < jl.length; i++) {
			jl[i]=new JLabel();
			jl[i].setSize(10, 10);
			jl[i].setOpaque(true);
			jl[i].setBackground(Color.BLUE);
		}
//		c.setLocation(50, 50);
		for (int i = 0; i < jl.length; i++) {
			int a=(int)(Math.random()*200)+50;
			int b=(int)(Math.random()*200)+50;
			jl[i].setLocation(a,b);
			c.add(jl[i]);
		}
		
		
		
		setSize(350,350);
		setVisible(true);
	}

}
