package _GUI._04_그래픽컴포넌트;

import java.awt.*;
import javax.swing.*;

public class D1108_04_도형그리기칠하기ex_drawLine메소드 extends JFrame {

	
	public D1108_04_도형그리기칠하기ex_drawLine메소드() {
		
		JPanel panel = new JPanel () {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setColor(Color.red);
				g.drawLine(20, 20, 100, 100);
			}
		};

		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(200, 170);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new D1108_04_도형그리기칠하기ex_drawLine메소드();
	}

}
