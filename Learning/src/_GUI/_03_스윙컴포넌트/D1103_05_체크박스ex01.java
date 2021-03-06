package _GUI._03_스윙컴포넌트;

import javax.swing.*;
import java.awt.*;

public class D1103_05_체크박스ex01 extends JFrame {

	public D1103_05_체크박스ex01() {
		setTitle("체크박스 만들기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedcherryIcon = new ImageIcon("images/selectedCherry.jpg");

		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리", cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedcherryIcon);

		c.add(apple);
		c.add(pear);
		c.add(cherry);

		setSize(250, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		new D1103_05_체크박스ex01();
	}

}
