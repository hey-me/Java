package _GUI._04_�׷���������Ʈ;

import java.awt.Graphics;

import javax.swing.*;

public class D1108_02_�׷���ex_drawString�޼ҵ� extends JFrame {

	private MyPanel01 panel = new MyPanel01();
	public D1108_02_�׷���ex_drawString�޼ҵ�() {
		setTitle("drawString ��� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250, 200);
		setVisible(true);
		
	}
	
	class MyPanel01 extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("�ڹ�?", 30, 30);
			g.drawString("�󸶳�", 60, 60);
		}
	}
	
	
	public static void main(String[] args) {

		new D1108_02_�׷���ex_drawString�޼ҵ�();
	}

}
