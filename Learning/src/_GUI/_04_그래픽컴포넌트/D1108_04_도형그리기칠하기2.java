package _GUI._04_그래픽컴포넌트;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class D1108_04_도형그리기칠하기2 {

	class MyPanel_원 extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawOval(20,20,80,80);
		}
	}

	class MyPanel_사각형 extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawRect(20,20,80,80);
		}
	}

	class MyPanel_사각형_둥근모서리 extends JPanel {
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
