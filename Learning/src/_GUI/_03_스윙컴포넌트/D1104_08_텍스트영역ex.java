package _GUI._03_스윙컴포넌트;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class D1104_08_텍스트영역ex extends JFrame {

	private JTextField tf = new JTextField(20);	
	private JTextArea ta = new JTextArea(7, 20);
	
	public D1104_08_텍스트영역ex() {
		setTitle("텍스트영역");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <Enter>키를 입력하세요"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText()+"Wn");
				t.setText("");
				
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new D1104_08_텍스트영역ex();
	}

}
