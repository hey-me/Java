package _GUI._03_스윙컴포넌트;

import java.awt.*;
import javax.swing.*;

public class D1104_06_라디오버튼ex extends JFrame {

	public D1104_06_라디오버튼ex() {
		setTitle("라디오버튼 만들기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
		
		ButtonGroup g = new ButtonGroup();
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new D1104_06_라디오버튼ex();
	}

}
