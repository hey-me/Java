package test1102;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 {
	public static void main(String[] args) {
	new Movement();
}
}

class Movement extends JFrame{
	Movement(){
		setTitle("한글자씩 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label=new JLabel("Java Love");
		c.add(label);
		c.setFocusable(true);
		c.requestFocus();
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String str=label.getText();
				int direction=e.VK_LEFT;
				if(e.getKeyCode()==direction) {
					String start=str.substring(0, 1);
					String end=str.substring(1);
					String word=end+start;
					label.setText(word);
				}
			}
		});
		
		setSize(300, 200);
		setVisible(true);
				
	}
}
