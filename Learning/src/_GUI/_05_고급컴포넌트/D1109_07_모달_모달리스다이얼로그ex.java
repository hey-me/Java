package _GUI._05_고급컴포넌트;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class D1109_07_모달_모달리스다이얼로그ex extends JFrame {

	private JButton btn = new JButton("Show Modal Dialog");

	public D1109_07_모달_모달리스다이얼로그ex() {
		setTitle("모달 다이얼로그");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Dialog dialog = new Dialog(this, "Test Modal dialog");

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
				if (dialog.getInput() == null) {
					return;
				}
				JButton btn = (JButton) e.getSource();
				btn.setText(dialog.getInput());}
			
		});
		getContentPane().add(btn);
		setSize(250, 300);
		setVisible(true);

	}

	class Dialog extends JDialog {
		private JTextField tf = new JTextField(5);
		private JButton bt = new JButton("OK");

		public Dialog(JFrame frame, String title) {
			super(frame, title, true);
			setLayout(new FlowLayout());
			add(tf);
			add(bt);
			setSize(200, 200);
			bt.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}

			});
		}

		public String getInput() {
			if (tf.getText().length() == 0)
				return null;
			else
				return tf.getText();
		}

	}

	public static void main(String[] args) {
		new D1109_07_모달_모달리스다이얼로그ex();
	}

}
