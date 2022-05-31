package test1102;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex01 {

	public static void main(String[] args) {
//1. ���콺 �ø��� ������ ����(Love Java -> �ڹ� ����)
//���콺�� ���ٴ��(entered) love java, ���콺�� ��Ű�� �ڹ����Ʒ�(exist)
		new LoveJava();
	}

}
class LoveJava extends JFrame{
	LoveJava(){
		setTitle("�ڹ�����?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label=new JLabel("Love Java");
		c.add(label);
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				JLabel la=(JLabel)e.getSource();
				la.setText("Love Java");
				//c.add(la)�� �Ѱ͵� �ƴѵ� �����̸��� �ٸ��� ��� �ٲ�°���
//				label.setText("Love Java");
			}
		});
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e){
				label.setText("�ڹ� ����");
			}
		});
		
		setSize(300, 200);
		setVisible(true);
	}
}