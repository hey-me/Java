package _GUI._04_�׷���������Ʈ;

import java.awt.*;
import javax.swing.*;

public class D1108_04_�����׸���ĥ�ϱ�ex_drawLine�޼ҵ� extends JFrame {

	
	public D1108_04_�����׸���ĥ�ϱ�ex_drawLine�޼ҵ�() {
		
		JPanel panel = new JPanel () {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setColor(Color.red);
				g.drawLine(20, 20, 100, 100);
			}
		};

		setTitle("drawLine ��� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(200, 170);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new D1108_04_�����׸���ĥ�ϱ�ex_drawLine�޼ҵ�();
	}

}
