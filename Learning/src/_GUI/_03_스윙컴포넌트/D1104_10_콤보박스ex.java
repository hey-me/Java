package _GUI._03_½ºÀ®ÄÄÆ÷³ÍÆ®;

import javax.swing.*;
import java.awt.*;

public class D1104_10_ÄÞº¸¹Ú½ºex extends JFrame {

	private String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry",
			"blackberry" };
	private String[] names = { "kitae", "jaemoon", "hyosoo", "namyun" };

	public D1104_10_ÄÞº¸¹Ú½ºex() {
		setTitle("ÄÞº¸¹Ú½º");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		c.add(strCombo);
		
		JComboBox<String> nameCombo = new JComboBox<String>();
		for (int i = 0; i < names.length; i++) {
			nameCombo.addItem(names[i]);
			c.add(nameCombo);
		}
		
		setSize(300,300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new D1104_10_ÄÞº¸¹Ú½ºex();
	}

}
