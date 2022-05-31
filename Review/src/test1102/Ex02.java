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
		super("마우스 드래그");
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
		//거으 ㅣ똑같은 코드가 들어갈거같으면 익명클래스가아니라 따로 클래스만들어서 갈끔하게 작업
		
		
		
		setSize(300, 200);
		setVisible(true);
	}
}