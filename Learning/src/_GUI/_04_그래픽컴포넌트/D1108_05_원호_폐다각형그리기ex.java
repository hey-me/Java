package _GUI._04_�׷���������Ʈ;

import java.awt.*;
import java.awt.Graphics;

import javax.swing.*;

public class D1108_05_��ȣ_��ٰ����׸���ex extends JFrame {

	private MyPanel_��ȣ panel��ȣ = new MyPanel_��ȣ();
	private MyPanel_��ٰ��� panel��ٰ��� = new MyPanel_��ٰ���();
	
	public D1108_05_��ȣ_��ٰ����׸���ex() {
		setTitle("��ȣ�� ��ٰ���");
		setDefaultCloseOperation(EXIT_ON_CLOSE );
		setContentPane(panel��ȣ);
//		setContentPane(panel��ٰ���);
		
		setSize(500, 500);
		setVisible(true);
		
		
	}
	
	
	class MyPanel_��ȣ extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			
			g.drawArc(20, 100, 80, 80, 90, 270);
		}
	}
	
	class MyPanel_��ٰ��� extends JPanel {
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

		new D1108_05_��ȣ_��ٰ����׸���ex();
	}

}
