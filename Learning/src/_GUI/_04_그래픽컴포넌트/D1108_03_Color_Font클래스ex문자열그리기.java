package _GUI._04_그래픽컴포넌트;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

public class D1108_03_Color_Font클래스ex문자열그리기 extends JFrame{

	
	private MyPanel_font_color panel = new MyPanel_font_color(); 
	
	public D1108_03_Color_Font클래스ex문자열그리기() {
		setTitle("color, font 사용 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(350, 470);
		setVisible(true);
		
	}
	
	class MyPanel_font_color extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.drawString("I love Java", 30, 30);
			
			g.setColor(new Color(255, 0, 0));
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			g.drawString("How much?", 30, 60);
			
			g.setColor(new Color(0x00ff00ff));
			for (int i = 1; i <= 5; i++) {
				g.setFont(new Font("Jokerman", Font.ITALIC, i*10));
				g.drawString("This much!", 30, 60+i*60);
			}
		}
	}
	
	public static void main(String[] args) {
		new D1108_03_Color_Font클래스ex문자열그리기();
	}

}
