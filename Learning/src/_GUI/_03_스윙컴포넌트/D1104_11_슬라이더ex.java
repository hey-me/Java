package _GUI._03_����������Ʈ;

import java.awt.*;
import javax.swing.*;

public class D1104_11_�����̴�ex extends JFrame {

	public D1104_11_�����̴�ex() {
		setTitle("�����̴� �����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100); // ������ ���ڰ� �ʱⰪ. �����̴��� ��� ����
		slider.setPaintLabels(true);  //50���� ���ڰ� ���̰�
		slider.setPaintTrack(true);  //?
		slider.setPaintTicks(true);  // ���ݼ� ���̰�
		slider.setMajorTickSpacing(50);  //50���� ����, ���� 
		slider.setMinorTickSpacing(10);  //10ũ�� ���� ���ݼ�
		
		c.add(slider);
		setSize(300, 100);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new D1104_11_�����̴�ex();
	}

}
