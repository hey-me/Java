package _GUI._05_고급컴포넌트;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class D1108_05_툴팁활성화_시간제어ex extends JFrame {

	public D1108_05_툴팁활성화_시간제어ex() {
		setTitle("툴팁 지연 시간 제어 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel cherryLabel = new JLabel(new ImageIcon("images/cherry.jpg"));
		
		cherryLabel.setToolTipText("체리 이미지 어때요");
		JLabel appleLabel = new JLabel(new ImageIcon("images/apple.jpg"));
		appleLabel.setToolTipText("사과 이미지 어때요");
		c.add(cherryLabel);
		c.add(appleLabel);
		
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0);
		m.setDismissDelay(10000);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new D1108_05_툴팁활성화_시간제어ex();
	}

}
