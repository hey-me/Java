package _GUI._04_그래픽컴포넌트;

import java.awt.*;
import java.awt.Graphics;

import javax.swing.*;

public class D1108_05_원호_폐다각형그리기ex extends JFrame {

	private MyPanel_원호 panel원호 = new MyPanel_원호();
	private MyPanel_폐다각형 panel폐다각형 = new MyPanel_폐다각형();
	
	public D1108_05_원호_폐다각형그리기ex() {
		setTitle("원호와 폐다각형");
		setDefaultCloseOperation(EXIT_ON_CLOSE );
		setContentPane(panel원호);
//		setContentPane(panel폐다각형);
		
		setSize(500, 500);
		setVisible(true);
		
		
	}
	
	
	class MyPanel_원호 extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			
			g.drawArc(20, 100, 80, 80, 90, 270);
		}
	}
	
	class MyPanel_폐다각형 extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			
			int [] x = {80,40,80,120};
			int[] y = {40,120,200,120};
			g.drawPolygon(x,y,4);
		}
	}
	
	public static void main(String[] args) {

		new D1108_05_원호_폐다각형그리기ex();
	}

}
