package _GUI._03_����������Ʈ;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class D1103_02_���̺�������Ʈex01 extends JFrame {

	public D1103_02_���̺�������Ʈex01() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("����մϴ�");
		
		ImageIcon beauty = new ImageIcon("images/beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		JLabel label = new JLabel("��������� ��ȭ�ϼ���", normalIcon, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(400, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new D1103_02_���̺�������Ʈex01();
	}

}
