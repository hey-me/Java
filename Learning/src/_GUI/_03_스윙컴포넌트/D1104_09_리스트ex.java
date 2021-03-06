package _GUI._03_스윙컴포넌트;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class D1104_09_리스트ex extends JFrame {

	private String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry",
			"blackberry" };
	private ImageIcon[] images = { new ImageIcon("images/icon1.png"), new ImageIcon("images/icon2.png"),
			new ImageIcon("images/icon3.png"), new ImageIcon("images/icon4.png") };

	public D1104_09_리스트ex() {
		setTitle("리스트 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		
		JList<ImageIcon> imageList = new JList<ImageIcon>(/*images*/);
		imageList.setListData(images);
		c.add(imageList);
		
		JList<String> scrollList = new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new D1104_09_리스트ex();
	}

}
