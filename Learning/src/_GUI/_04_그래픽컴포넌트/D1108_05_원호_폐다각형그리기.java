package _GUI._04_�׷���������Ʈ;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class D1108_05_��ȣ_��ٰ����׸��� {
/*
	*��ȣ�� ��ٰ��� �׸��� Graphics �޼ҵ�

		1) void drawArc (int x, int y, int w, int h, int startAngle, int arcAngle)
				startAngle : ��ȣ�� ���� ����
				arcAngle: ��ȣ�� ����
				(x,y)���� w x h �� ũ���� �簢���� �����ϴ� ��ȣ�� �׸���.
				3�� ������ 0�� �����̴�.
				startAngle �������� arcAngle ������ŭ ��ȣ�� �׸���. 
				arcAngle�� ����̸� �ݽð� ����, �����̸� �ð� �������� �׸���.
				
		2) void drawPolygon(int[] x, int[] y, int n)
				x, y �迭�� ����� ���� �� n���� �����ϴ� ��ٰ����� �׸���.
				(x[0], y[0]), (x[1], y[1]), ... (x[n-1],y[n-1]), (x[0], y[0])��
				������ ������� �����Ѵ�.
*/
	class MyPanel_��ȣ extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);

			g.drawArc(20,100,80,80,90,270);
		}
	}

	
	class MyPanel_���̾� extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);

			int []x = {80,40,80,120};
			int []y = {40,120,200,120}; 
			g.drawPolygon(x, y, 4);
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
