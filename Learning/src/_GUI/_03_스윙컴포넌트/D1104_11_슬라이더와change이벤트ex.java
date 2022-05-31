package _GUI._03_����������Ʈ;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class D1104_11_�����̴���change�̺�Ʈex extends JFrame {

	private JLabel colorLabel;
	private JSlider[] sl = new JSlider[3];

	public D1104_11_�����̴���change�̺�Ʈex() {
		setTitle("�����̴� ü���� �̺�Ʈ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		colorLabel = new JLabel("slider example");
		for (int i = 0; i < sl.length; i++) {
//			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128); //���� �����̴�
			sl[i] = new JSlider(JSlider.VERTICAL, 0, 255, 128);  //���� �����̴�
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			sl[i].addChangeListener(new ChangeListener() {

				@Override
				public void stateChanged(ChangeEvent e) {
					int r = sl[0].getValue();
					int g = sl[1].getValue();
					int b = sl[2].getValue();
					colorLabel.setBackground(new Color(r, g, b));
				}
			});
			c.add(sl[i]);
		}
		sl[0].setForeground(Color.red); // ���� ����, ���� ���� ����.
		sl[1].setForeground(Color.green);
		sl[2].setForeground(Color.blue);

//		int r = sl[0].getValue();
//		int g = sl[1].getValue();
//		int b = sl[2].getValue();
//		colorLabel.setBackground(new Color(r, g, b));
		colorLabel.setOpaque(true); //����
		c.add(colorLabel);
		setSize(300, 230);
		setVisible(true);
	}

	public static void main(String[] args) {
		new D1104_11_�����̴���change�̺�Ʈex();
	}

}
