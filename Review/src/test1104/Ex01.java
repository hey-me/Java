package test1104;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex01 {

	public static void main(String[] args) {
//1. �׸��� ���� 2���� üũ�ڽ��� ��ư�� �����. "��ư ��Ȱ��ȭ" üũ�ڽ��� �����ϸ� ��ư�� �۵����� ���ϰ� �ϰ�,
//	�����ϸ� �ٽ� �۵��ϰ� �Ѵ�. "��ư ���߱�" üũ�ڽ��� �����ϸ� ��ư�� ������ �ʵ��� �ϰ� �����ϸ� ��ư�� ���̵��� �Ѵ�.
		new Check1();
	}

}
class Check1 extends JFrame{
	Check1(){
		setLocation(800, 400);
		setTitle("üũ�ڽ�2��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel panel=new JPanel();
		JCheckBox check1=new JCheckBox("��ư ��Ȱ��ȭ");
		JCheckBox check2=new JCheckBox("��ư ���߱�");
		JButton button=new JButton("test button");
		
		check1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if(e.getStateChange()==ItemEvent.SELECTED) {
				button.setEnabled(false);
				}else {
					button.setEnabled(true);
				}
			}
		});
		check2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
				button.setVisible(false);
				}else {
					button.setVisible(true);
				}
			}
		});
		
		panel.add(check1);
		panel.add(check2);
		JPanel panel2=new JPanel();
		button.setSize(100, 50);
		panel2.add(button);
		
		c.add(panel, BorderLayout.NORTH);
		c.add(panel2, BorderLayout.CENTER);
		
		
		setSize(300, 150);
		setVisible(true);
	}
}
