package test1102;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex05 {

	public static void main(String[] args) {
		new Wheel();
	}

}
class Wheel extends JFrame{
	Wheel(){
		setTitle("크기조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		setSize(300, 300);
		c.addMouseWheelListener(new MouseAdapter() {
			int size=10;
			@Override
			public void mouseWheelMoved(MouseWheelEvent e){
				
				if(e.getWheelRotation()<0) {
					setSize(getWidth()-size,getHeight()-size);
				}else {
					setSize(getWidth()+size,getHeight()+size);
				}
			}
		});

		setVisible(true);
		
	}
}