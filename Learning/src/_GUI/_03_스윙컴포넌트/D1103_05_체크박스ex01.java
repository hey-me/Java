package _GUI._03_����������Ʈ;

import javax.swing.*;
import java.awt.*;

public class D1103_05_üũ�ڽ�ex01 extends JFrame {

	public D1103_05_üũ�ڽ�ex01() {
		setTitle("üũ�ڽ� �����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedcherryIcon = new ImageIcon("images/selectedCherry.jpg");

		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��", true);
		JCheckBox cherry = new JCheckBox("ü��", cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedcherryIcon);

		c.add(apple);
		c.add(pear);
		c.add(cherry);

		setSize(250, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		new D1103_05_üũ�ڽ�ex01();
	}

}
