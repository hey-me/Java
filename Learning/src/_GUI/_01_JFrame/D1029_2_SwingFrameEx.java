package _GUI._01_JFrame;

import java.awt.*;

import javax.swing.*;

public class D1029_2_SwingFrameEx extends JFrame {

	public D1029_2_SwingFrameEx() {
		super("swingFrameEx");
		// �Ʒ���setTitle�� ����.
		setTitle("swingFrameEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â������ ������ ����.
		
		Container c = getContentPane(); // ����Ʈ���� �� ��������
		c.setBackground(Color.orange);
		c.setLayout(new FlowLayout()); //���� ..��ư�� ��ġ�ϴ� ������ �����ϴ� ��.
		//FlowLayout�� ���ʺ��� ���ʴ�� ��ġ
		
		
		JButton b = new JButton("click");
		c.add(b); // �Ʒ���ó�� �ٷ� ��� ��.
		c.add(new JButton("OK"));
		c.add(new JButton("Yes"));
		c.add(new JButton("No"));

//		JPanel p = new JPanel();
//		setContentPane(p);

		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new D1029_2_SwingFrameEx();

	}

}
