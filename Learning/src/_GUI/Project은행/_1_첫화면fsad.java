package _GUI.Project은행;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _1_첫화면fsad extends JFrame {

	private JTextField idTf;
	private JTextField passTf;
	
	public _1_첫화면fsad() {
		setTitle("자바 은행");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel javaLa = new JLabel("\uC790\uBC14 \uC740\uD589");
		javaLa.setBounds(167, 27, 87, 24);
		javaLa.setFont(new Font("굴림", Font.PLAIN, 20));
		panel.add(javaLa);
		
		JLabel idLa = new JLabel("ID");
		idLa.setBounds(120, 90, 57, 15);
		panel.add(idLa);
		
		idTf = new JTextField();
		idTf.setBounds(192, 87, 120, 20);
		panel.add(idTf);
		idTf.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setBounds(120, 120, 57, 15);
		panel.add(lblNewLabel_3);
		
		passTf = new JTextField();
		passTf.setBounds(192, 117, 116, 21);
		panel.add(passTf);
		passTf.setColumns(10);
		
		
		JButton login = new JButton("\uB85C\uADF8\uC778");
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		login.setBounds(170, 160, 100, 30);
		panel.add(login);
		
		JButton signUp = new JButton("\uD68C\uC6D0\uAC00\uC785");
		signUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
	
		signUp.setBounds(335, 227, 87, 24);
		panel.add(signUp);
		
		setSize(500, 500);
		setVisible(true);
	}
	
public static void main(String[] args) {
	new _1_첫화면fsad();
}	
}

