package test1101;

import java.awt.*;
import javax.swing.*;

public class Ex08 {

	public static void main(String[] args) {
		new Pframe();
	}

}

class Pframe extends JFrame{
	Pframe(){
		super("여러 개 패널 프레임");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		setLayout(new BorderLayout());
		c.add(northFrame(), BorderLayout.NORTH);
		c.add(southFrame(), BorderLayout.SOUTH);
		c.add(centerFrame(), BorderLayout.CENTER);
		setSize(400, 300);
		setVisible(true);
	}
	JPanel northFrame() {
		JPanel jp=new JPanel();
		jp.setBackground(Color.LIGHT_GRAY);
		jp.setLayout(new FlowLayout());
		jp.add(new JButton("열기"));
		jp.add(new JButton("닫기"));
		jp.add(new JButton("나가기"));
		return jp;
	}
	
	JPanel centerFrame() {
		JPanel jp3=new JPanel();
		jp3.setOpaque(true);
		jp3.setBackground(Color.WHITE);
		jp3.setLayout(null);
		JLabel[]jl=new JLabel[10];
		for (int i = 0; i < jl.length; i++) {
			jl[i]=new JLabel("@");
			jl[i].setForeground(Color.red);
			int a=(int)(Math.random()*300);
			int b=(int)(Math.random()*100);
			jl[i].setLocation(a,b);
			jp3.add(jl[i]);
			jl[i].setSize(100,100);
		}
		return jp3;
	}
	
	JPanel southFrame() {
		JPanel jp2=new JPanel();
		jp2.setBackground(Color.yellow);
		jp2.setLayout(new FlowLayout());
		jp2.add(new JButton("Word Input"));
		jp2.add(new JTextField(20));
		return jp2;
	}
}