package test1101;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex07 {

	public static void main(String[] args) {
		new SF();
	}

}
class SF extends JFrame{
	SF(){
		super("계산기 프레임");
		Container c=getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.setLayout(new BorderLayout());
		JPanel jp=new JPanel();
		c.add(jp,BorderLayout.NORTH);
		jp.setLayout(new FlowLayout());
		jp.add(new JLabel("수식입력"));
		jp.add(new TextField(20));
		jp.setBackground(Color.LIGHT_GRAY);
		
		
		JPanel jp2=new JPanel();
		jp2.setLayout(new GridLayout(4, 4,5,5));
		
		
		JButton[] jb=new JButton[16];
		for (int i = 0; i < 10; i++) {
			jb[i]=new JButton(Integer.toString(i));
		}
		jb[10]=new JButton("CE");
		jb[11]=new JButton("계산");
		jb[12]=new JButton("+");
		jb[12].setBackground(Color.cyan);
		jb[13]=new JButton("-");
		jb[14]=new JButton("X");
		jb[15]=new JButton("/");
		for (int i = 0; i < jb.length; i++) {
			jp2.add(jb[i]);
		}
		c.add(jp2, BorderLayout.CENTER);
		
		
		
		JPanel jp3=new JPanel();
		jp3.setBackground(Color.YELLOW);
		jp3.add(new JLabel("계산 결과"));
		jp3.add(new TextField(30+HEIGHT));
		c.add(jp3, BorderLayout.SOUTH);
		setSize(400, 300);
		setVisible(true);
	}
}

