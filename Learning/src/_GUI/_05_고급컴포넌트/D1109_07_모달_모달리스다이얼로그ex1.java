package _GUI._05_고급컴포넌트;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class D1109_07_모달_모달리스다이얼로그ex1 extends JFrame {
	private MyModalDialog dialog;
 	public D1109_07_모달_모달리스다이얼로그ex1() {
		super("DialogEx2 예제 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn  = new JButton("Show Modal Dialog");

		dialog = new MyModalDialog(this, "Test Modal Dialog");

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
				
				String text = dialog.getInput();

				if(text == null) return;
				JButton btn = (JButton)e.getSource();
				btn.setText(text);
			}
		});
		getContentPane().add(btn);
		setSize(250,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new D1109_07_모달_모달리스다이얼로그ex1();
	}
}


class MyModalDialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton okButton = new JButton("OK");
	
	public MyModalDialog(JFrame frame, String title) {
		super(frame,title, true); // 모달 다이얼로그로 설정
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);

		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}

	public String getInput() {
		if(tf.getText().length() == 0) return null;
		else return tf.getText();
	}
}
