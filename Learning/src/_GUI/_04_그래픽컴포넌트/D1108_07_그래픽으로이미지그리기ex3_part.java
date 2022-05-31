package _GUI._04_그래픽컴포넌트;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class D1108_07_그래픽으로이미지그리기ex3_part extends JFrame {

	private MyPanel panel = new MyPanel();
	
	public D1108_07_그래픽으로이미지그리기ex3_part() {
		setTitle("이미지 일부분 크기 조절하여 그리기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
		
	}
	
			
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 20, 20, 250, 100, 100,50,200,200,this);
			
		}
	}		
			
	public static void main(String[] args) {
		new D1108_07_그래픽으로이미지그리기ex3_part();
	}

}