package _GUI._04_�׷���������Ʈ;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class D1108_07_�׷��������̹����׸���ex2_full extends JFrame {

	private MyPanel panel = new MyPanel();
	
	public D1108_07_�׷��������̹����׸���ex2_full() {
		setTitle("�г� ũ�⿡ ���߾� �̹��� �׸���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(200, 300);
		setVisible(true);
		
	}
	
			
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
		}
	}		
			
	public static void main(String[] args) {
		new D1108_07_�׷��������̹����׸���ex2_full();
	}

}