package _GUI._04_그래픽컴포넌트;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class D1108_06_도형칠하기ex extends JFrame {

	private MyPanel_도형칠하기 panel = new MyPanel_도형칠하기(); 
	public D1108_06_도형칠하기ex() {
		setTitle("도형칠하기 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setContentPane(panel);
		setSize(100, 350);
		setVisible(true);
	}
	
	class 	MyPanel_도형칠하기 extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.blue);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.green);
			g.fillRoundRect(10, 130, 50, 50, 20, 20);
			g.setColor(Color.magenta);
			g.fillArc(10, 190, 50, 50, 0, 270);
			g.setColor(Color.orange);
			int[] x = {30,10,30,60};
			int[]y = {250,275,300,275};
			g.fillPolygon(x,y,4);
			
		}
	}	
			
	public static void main(String[] args) {
		new D1108_06_도형칠하기ex();
	}

}
