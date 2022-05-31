package _GUI._03_스윙컴포넌트;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class D1103_01_컴포넌트ex01 extends JFrame {
// 세번째 버튼 클릭하면 제목을 위치값으로 바꾸기.
	public D1103_01_컴포넌트ex01() {
		setTitle("JComponent의 공통 메소드 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("Disabled Button");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.magenta);
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		b2.setEnabled(false);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				D1103_01_컴포넌트ex01 frame = (D1103_01_컴포넌트ex01)b.getTopLevelAncestor();
				frame.setTitle(b.getX()+","+b.getY());
			}
		});
		c.add(b1);
		c.add(b2);
		c.add(b3);
		setSize(260,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new D1103_01_컴포넌트ex01();
	}

}
