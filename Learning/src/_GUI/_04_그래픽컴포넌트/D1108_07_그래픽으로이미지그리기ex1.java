package _GUI._04_�׷���������Ʈ;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class D1108_07_�׷��������̹����׸���ex1 extends JFrame {

	private MyPanel_�̹���1 panel = new MyPanel_�̹���1();
	
	public D1108_07_�׷��������̹����׸���ex1() {
		setTitle("����ũ��� ���ϴ� ��ġ�� �̹��� �׸���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 420);
		setVisible(true);
		
	}
	
			
	class MyPanel_�̹���1 extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 20, 20, this);
		}
	}		
			
	public static void main(String[] args) {
		new D1108_07_�׷��������̹����׸���ex1();
	}

}
