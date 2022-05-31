package _GUI._05_���������Ʈ;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class D1109_06_���̾�α�ex extends JFrame {

	private MyDialog dialog;

	public D1109_06_���̾�α�ex() {
		setTitle("Dialog ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Dialog");

		dialog = new MyDialog(this, "Test Dialog");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				dialog.setVisible(true);
			}
		});
		getContentPane().add(btn);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new D1109_06_���̾�α�ex();
	}

}

class MyDialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton okButton = new JButton("OK");

	MyDialog(JFrame frame, String title) {
		super(frame, title);
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);

		okButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}
}