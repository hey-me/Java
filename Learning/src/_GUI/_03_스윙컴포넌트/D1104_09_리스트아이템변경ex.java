package _GUI._03_����������Ʈ;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;

public class D1104_09_����Ʈ�����ۺ���ex extends JFrame {

	private JTextField tf = new JTextField(10);
	private Vector<String> v = new Vector<String>();
	private JList<String> nameList = new JList<String>(v);
	
	public D1104_09_����Ʈ�����ۺ���ex() {
	
		setTitle("����Ʈ ������ ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�̸� �Է� �� <Enter>Ű"));
		c.add(tf);
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				v.add(t.getText());
				t.setText("");
				nameList.setListData(v);
			}
		});
		
		v.add("Ȳ����");
		v.add("���繮");
		nameList.setVisibleRowCount(5);
		nameList.setFixedCellWidth(100);
		c.add(new JScrollPane(nameList));
		
		setSize(300, 300);
		setVisible(true);
		
		
		
	}
	
	
	public static void main(String[] args) {
		new D1104_09_����Ʈ�����ۺ���ex();
	}

}
