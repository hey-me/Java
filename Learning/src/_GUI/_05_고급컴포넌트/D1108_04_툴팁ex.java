package _GUI._05_���������Ʈ;

import java.awt.*;

import javax.swing.*;

public class D1108_04_����ex extends JFrame{
	
	private Container contentpane;
	
	public D1108_04_����ex() {
		setTitle("���� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentpane = getContentPane();
		createToolBar();
		setSize(400, 150);
		setVisible(true);
	
	}
	
	
	
	private void createToolBar() {
		JToolBar bar = new JToolBar("Kitae Menu");
		contentpane.setBackground(Color.LIGHT_GRAY);
		
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("������ �����մϴ�.");
		bar.add(newBtn);
		
		JButton openBtn = new JButton(new ImageIcon("images/open.jpg"));
		openBtn.setToolTipText("������ ���ϴ�");
		bar.add(openBtn);
		bar.addSeparator();
		
		JButton saveBtn =  new JButton(new ImageIcon("images/save.jpg"));
		saveBtn.setToolTipText("������ �����մϴ�");
		bar.add(saveBtn);
		
		bar.add(new JLabel("search"));
		
		JTextField tf = new JTextField("text field");
		tf.setToolTipText("ã�����ϴ� ���ڿ��� �Է��ϼ���");
		bar.add(tf);
		contentpane.add(bar, BorderLayout.NORTH);
		
//		ToolTipManager m = ToolTipManager.sharedInstance(); ��ü����
//		m.setEnabled(true); Ȱ��ȭ ��Ȱ��ȭ
//		m.setInitialDelay(2000); ������ ��Ÿ���� ���� �����ð� ����
//		m.setDismissDelay(2000); ������ �����ִ� �����ð�����
		
	}



	public static void main(String[] args) {
		new D1108_04_����ex();
	}

}
