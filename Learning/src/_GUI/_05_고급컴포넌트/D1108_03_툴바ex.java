package _GUI._05_고급컴포넌트;

import java.awt.*;
import javax.swing.*;

public class D1108_03_툴바ex extends JFrame {

	private Container contentpane;
	public D1108_03_툴바ex() {
		setTitle("툴바 만들기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentpane = getContentPane();
		createToolBar();
		setSize(400, 200);
		setVisible(true);
		
	}
	
	private void createToolBar() {

		JToolBar toolBar = new JToolBar("Kitae Menu");
		contentpane.setBackground(Color.LIGHT_GRAY);
		
		toolBar.add(new JButton("New"));
		toolBar.add(new JButton(new ImageIcon ("images/open.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("images/save.jpg")));
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		
		JComboBox combo = new JComboBox();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		contentpane.add(toolBar, BorderLayout.NORTH);
		
	}

	public static void main(String[] args) {
		new D1108_03_툴바ex();
	}

}
