package test1102;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Ex02 {

	public static void main(String[] args) {
		new DragMouse();
	}

}
class DragMouse extends JFrame{
	DragMouse(){
		super("���콺 �巡��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setBackground(Color.green);
		c.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				c.setBackground(Color.yellow);
			}
		});
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				c.setBackground(Color.green);
			}
		});
		//���� �ӶȰ��� �ڵ尡 ���Ű����� �͸�Ŭ�������ƴ϶� ���� Ŭ�������� �����ϰ� �۾�
		
		
		
		setSize(300, 200);
		setVisible(true);
	}
}