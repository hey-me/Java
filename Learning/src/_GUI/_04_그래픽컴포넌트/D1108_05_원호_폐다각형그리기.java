package _GUI._04_그래픽컴포넌트;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class D1108_05_원호_폐다각형그리기 {
/*
	*원호와 폐다각형 그리는 Graphics 메소드

		1) void drawArc (int x, int y, int w, int h, int startAngle, int arcAngle)
				startAngle : 원호의 시작 각도
				arcAngle: 원호의 각도
				(x,y)에서 w x h 의 크기의 사각형에 내접하는 원호를 그린다.
				3시 방향이 0도 기점이다.
				startAngle 지점에서 arcAngle 각도만큼 원호를 그린다. 
				arcAngle이 양수이면 반시계 방향, 음수이면 시계 방향으로 그린다.
				
		2) void drawPolygon(int[] x, int[] y, int n)
				x, y 배열에 저장된 점들 중 n개를 연결하는 폐다각형을 그린다.
				(x[0], y[0]), (x[1], y[1]), ... (x[n-1],y[n-1]), (x[0], y[0])의
				점들을 순서대로 연결한다.
*/
	class MyPanel_원호 extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);

			g.drawArc(20,100,80,80,90,270);
		}
	}

	
	class MyPanel_다이아 extends JPanel {
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
