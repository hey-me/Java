package _GUI._03_스윙컴포넌트;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class D1104_10_콤보박스와액션이벤트ex extends JFrame {

	private String[] fruits = { "apple", "banana", "kiwi", "mango" };
	private ImageIcon[] images = { new ImageIcon("images/apple.jpg"), new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/kiwi.jpg"), new ImageIcon("images/mango.jpg") };
	private JLabel imgLabel = new JLabel(images[0]);
	private JComboBox<String> strCombo = new JComboBox<String>(fruits);
	
	
	public D1104_10_콤보박스와액션이벤트ex() {
		setTitle("콤보박스와 이벤트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imgLabel);
		
		strCombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});
		
		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new D1104_10_콤보박스와액션이벤트ex();
	}

}
