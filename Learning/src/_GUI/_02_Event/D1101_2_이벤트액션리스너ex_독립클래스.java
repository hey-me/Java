package _GUI._02_Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class D1101_2_이벤트액션리스너ex_독립클래스 extends JFrame {

	public D1101_2_이벤트액션리스너ex_독립클래스() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
//		btn.addActionListener(new ActionListener()){
//			
//		};
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new D1101_2_이벤트액션리스너ex_독립클래스();
	}

}

class MyActionListener implements ActionListener{
	@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if (b.getText().equals("Action")) {
				b.setText("액션");
			} else {
				b.setText("Action");
			}
		}	
	
}
