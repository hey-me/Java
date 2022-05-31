package _GUI._03_스윙컴포넌트;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class D1103_01_컴포넌트ex01_1 extends JFrame {
//첫번째 버튼 클릭하면 세번째 버튼 비활성화하기
	public D1103_01_컴포넌트ex01_1() {
		setTitle("JComponent의 공통 메소드 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("Disabled Button");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.magenta);
		b1.setFont(new Font("Arial", Font.ITALIC+Font.BOLD, 20));
		b2.setEnabled(false);
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				D1103_01_컴포넌트ex01_1 frame = (D1103_01_컴포넌트ex01_1)b.getTopLevelAncestor();
//				Container cc = b.getParent();
				
				frame.setTitle(b.getX()+","+b.getY());
			}
		});
		
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				b3.setEnabled(false);
			}
		});
		c.add(b1);
		c.add(b2);
		c.add(b3);
		
		setSize(260,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new D1103_01_컴포넌트ex01_1();
	}

}
