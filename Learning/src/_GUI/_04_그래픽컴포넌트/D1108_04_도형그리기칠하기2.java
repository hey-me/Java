package _GUI._04_�׷���������Ʈ;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class D1108_04_�����׸���ĥ�ϱ�2 {

	class MyPanel_�� extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawOval(20,20,80,80);
		}
	}

	class MyPanel_�簢�� extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawRect(20,20,80,80);
		}
	}

	class MyPanel_�簢��_�ձٸ𼭸� extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawRoundRect(20,20,120,80,40,60);
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
