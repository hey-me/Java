package test1102;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex06 {

	public static void main(String[] args) {
		new PlusMinus();
	}

}

class PlusMinus extends JFrame{
	PlusMinus(){
		setTitle("+,-");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
//		setLayout(new FlowLayout(FlowLayout.CENTER));
		setLayout(null);
		JLabel label=new JLabel("ㄷㄷㄷㅈ");
		label.setOpaque(true);
		label.setBackground(Color.cyan);
		label.setSize(200, 200);
//		라벨사이즈는 레이아웃이 null일때만 적용
		label.setLocation(0, 0);
		c.add(label);
		c.setFocusable(true);
		c.requestFocus();
		c.addKeyListener(new KeyAdapter() {
			int size=10;
			@Override
			public void keyPressed(KeyEvent e) {
				c.setFocusable(true);
				c.requestFocus();
				if(e.getKeyCode()==e.VK_ADD ) {
//					getKeyChar로 작업하는게 편함
					label.setSize(label.getWidth()+size,label.getHeight()+size);
//					label.setSize(50, 50);
					System.out.println(getWidth());
				}else if(e.getKeyCode()==e.VK_SUBTRACT) {
					label.setSize(label.getWidth()-size,label.getHeight()-size);
//					label.setSize(50, 50);
//					System.out.println(label.getWidth());
				}
			}
		});
		
		
		
		setSize(500, 500);
		setVisible(true);
	}
}
