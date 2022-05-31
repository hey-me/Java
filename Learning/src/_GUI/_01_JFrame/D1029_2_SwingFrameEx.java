package _GUI._01_JFrame;

import java.awt.*;

import javax.swing.*;

public class D1029_2_SwingFrameEx extends JFrame {

	public D1029_2_SwingFrameEx() {
		super("swingFrameEx");
		// 아래줄setTitle과 같음.
		setTitle("swingFrameEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫으면 꺼지게 해줌.
		
		Container c = getContentPane(); // 컨텐트펜의 값 가져오기
		c.setBackground(Color.orange);
		c.setLayout(new FlowLayout()); //구조 ..버튼을 배치하는 순서를 지정하는 것.
		//FlowLayout은 왼쪽부터 차례대로 배치
		
		
		JButton b = new JButton("click");
		c.add(b); // 아래줄처럼 바로 적어도 됨.
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
