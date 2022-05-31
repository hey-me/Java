package _GUI._04_그래픽컴포넌트;

import java.awt.Graphics;

import javax.swing.*;

public class D1108_02_그래픽ex_drawString메소드 extends JFrame {

	private MyPanel01 panel = new MyPanel01();
	public D1108_02_그래픽ex_drawString메소드() {
		setTitle("drawString 사용 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250, 200);
		setVisible(true);
		
	}
	
	class MyPanel01 extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("자바?", 30, 30);
			g.drawString("얼마나", 60, 60);
		}
	}
	
	
	public static void main(String[] args) {

		new D1108_02_그래픽ex_drawString메소드();
	}

}
