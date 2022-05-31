package test1104;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ex05 {

	public static void main(String[] args) {
		new FocusEx();
	}

}

class FocusEx extends JFrame{
	public FocusEx() {
		setTitle("FocusEvent연출");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		add(new JLabel("입력한 후 다른 창을 클릭하면 입력한 영문자가 대문자로 변경"));
		JTextField text=new JTextField(SwingConstants.CENTER);
		text.setPreferredSize(new Dimension(200, 20));
		
		text.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				JTextField tf=(JTextField)e.getSource();
				text.setText(tf.getText().toUpperCase());
			}
			
		});
		c.add(text);
		setSize(400, 150);
		setVisible(true);
	}
}