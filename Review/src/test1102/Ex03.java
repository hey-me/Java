package test1102;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex03 {

	public static void main(String[] args) {
		new Reverse();
	}

}

class Reverse extends JFrame{
	Reverse(){
		setTitle("µÚÁý±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		setLayout(new FlowLayout(FlowLayout.CENTER));
		StringBuffer word=new StringBuffer("Love Java");
		JLabel label=new JLabel(word.toString());
		c.add(label);
		
		c.setFocusable(true);
		c.requestFocus();
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int direction=e.getKeyCode();
				
				if(direction==e.VK_LEFT) {
					label.setText(word.reverse().toString());
				}
				c.setFocusable(true);
				c.requestFocus();
			}
		});
		
		setSize(300, 200);
		setVisible(true);
	}
}