package _GUI._03_����������Ʈ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class D1104_06_������ư���������̺�Ʈex extends JFrame {

	private JRadioButton[] radio = new JRadioButton[3];
	private String[] text = { "���", "��", "ü��" };
	private ImageIcon[] image = { new ImageIcon("images/apple.jpg"), new ImageIcon("images/pear.jpg"),
			new ImageIcon("images/cherry.jpg") };
	private JLabel imageLabel = new JLabel();
	
	public D1104_06_������ư���������̺�Ʈex() {

		setTitle("������ư, �������̺�Ʈ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.gray);
		ButtonGroup g = new ButtonGroup();
		
		for (int i = 0; i < image.length; i++) {
			radio[i]= new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()== ItemEvent.DESELECTED) {
						return;
					}
					if (radio[0].isSelected()) {
						imageLabel.setIcon(image[0]);
					} else if (radio[1].isSelected()){
						imageLabel.setIcon(image[1]);	
					} else {
						imageLabel.setIcon(image[2]);	
					}
				}
			});
		}
		
		radio[2].setSelected(true);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new D1104_06_������ư���������̺�Ʈex();

	}

}
