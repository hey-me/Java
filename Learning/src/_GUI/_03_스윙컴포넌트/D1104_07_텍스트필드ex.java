package _GUI._03_����������Ʈ;

import javax.swing.*;
import java.awt.*;


public class D1104_07_�ؽ�Ʈ�ʵ�ex extends JFrame {

	public D1104_07_�ؽ�Ʈ�ʵ�ex() {
		setTitle("�ؽ�Ʈ �ʵ� �����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(20));
		c.add(new JLabel("�а�"));
		c.add(new JTextField("��ǻ�Ͱ��а�", 20));
		c.add(new JLabel("�ּ�"));
		c.add(new JTextField("�����...", 20));
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new D1104_07_�ؽ�Ʈ�ʵ�ex();
	}

}
