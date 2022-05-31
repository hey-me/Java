package _GUI._04_�׷���������Ʈ;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class D1108_08_Ŭ����ex extends JFrame {

	private MyPanel panel = new MyPanel();
	
	public D1108_08_Ŭ����ex() {
		setTitle("Ŭ���� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 400);
		setVisible(true);
		
	}
			
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(100,20,150,150);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.yellow);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go Gator!", 10, 150);
			
		}
	}		
			
	public static void main(String[] args) {
		new D1108_08_Ŭ����ex();
	}

}