package _GUI._04_�׷���������Ʈ;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class D1108_01_����Ʈ������Ʈex extends JFrame {

	private MyPanel panel = new MyPanel();

	public D1108_01_����Ʈ������Ʈex() {
		setTitle("Jpanel�� paintConponent() ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250, 220);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.drawRect(10, 10, 50, 50);
			g.drawRect(50, 50, 50, 50);
			g.setColor(Color.magenta);
			g.drawRect(90, 90, 50, 50);
		}
		
	}

	public static void main(String[] args) {

		new D1108_01_����Ʈ������Ʈex();
	}

}
