package _GUI._05_���������Ʈ;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class D1108_05_����Ȱ��ȭ_�ð�����ex extends JFrame {

	public D1108_05_����Ȱ��ȭ_�ð�����ex() {
		setTitle("���� ���� �ð� ���� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel cherryLabel = new JLabel(new ImageIcon("images/cherry.jpg"));
		
		cherryLabel.setToolTipText("ü�� �̹��� ���");
		JLabel appleLabel = new JLabel(new ImageIcon("images/apple.jpg"));
		appleLabel.setToolTipText("��� �̹��� ���");
		c.add(cherryLabel);
		c.add(appleLabel);
		
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0);
		m.setDismissDelay(10000);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new D1108_05_����Ȱ��ȭ_�ð�����ex();
	}

}
