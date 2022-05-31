package _GUI._04_그래픽컴포넌트;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class D1108_07_그래픽으로이미지그리기ex1 extends JFrame {

	private MyPanel_이미지1 panel = new MyPanel_이미지1();
	
	public D1108_07_그래픽으로이미지그리기ex1() {
		setTitle("원본크기로 원하는 위치에 이미지 그리기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 420);
		setVisible(true);
		
	}
	
			
	class MyPanel_이미지1 extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 20, 20, this);
		}
	}		
			
	public static void main(String[] args) {
		new D1108_07_그래픽으로이미지그리기ex1();
	}

}
