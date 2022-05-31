package test1104;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ex02 {

	public static void main(String[] args) {
// JComboBox�� �̿��Ͽ� �� �޺��ڽ��� ����� JTextField ������Ʈ�� �Է� â�� ���ڿ��� �Է��� �� Enter Ű�� �Է���
// �� �� ���ڿ��� �޺��ڽ��� ���������� �����Ѵ�. ( �߰������� �Էµ� �ؽ�Ʈ�� ���������� �Ѵ�. )
		new ListChange();
	}

}
class ListChange extends JFrame{
	Vector<String> v=new Vector<String>();
	JComboBox<String> list=new JComboBox<String>(v);
	
	ListChange(){
		setTitle("����Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField tf=new JTextField(10);
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField text=(JTextField)e.getSource();
				if(v.contains(text.getText())) {
					v.remove(text.getText());
					text.setText("");
				}else {
					v.add(text.getText());
					text.setText("");
				}
			}
		});	
		list.setPreferredSize(new Dimension(100, 20));
		c.add(tf);
		c.add(list);
		
		setSize(300, 200);
		setVisible(true);
	}
}