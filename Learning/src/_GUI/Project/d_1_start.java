package _GUI.Project;

import java.awt.*;

import java.awt.event.*;
import java.io.*;

import javax.swing.*;


public class d_1_start extends JFrame {

	private JLabel first = new JLabel("My Diary");
	private JLabel idLa = new JLabel("ID");
	private JTextField idTf = new JTextField(15);
	private JLabel passLa = new JLabel("PASSWORD");
	private JTextField passTf = new JTextField(10);
	private JButton login = new JButton("�α���");
	private JButton signUp = new JButton("ȸ�� ����");
	private d_2_ȸ�����Դ��̾�α� signUpdialog = new d_2_ȸ�����Դ��̾�α�(this, "ȸ������");
	private d_3_�α��δ��̾�α� logindialog = new d_3_�α��δ��̾�α�(this, "�α���");
//	String str = "";
//	String restr = "";
	JPanel loginPanel = new JPanel();
	
	public d_1_start() {
		
		setSize(new Dimension(500, 500));
//		Container c = getContentPane();
		// diary
		setTitle("My Diary");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		loginPanel.setLayout(null);
		first.setFont(new Font("���", Font.BOLD, 40));
		first.setSize(190, 80);
		first.setLocation(getWidth()/2-first.getWidth()/2, 50);
		loginPanel.add(first);

		// ���̵�
		idLa.setFont(new Font("���", Font.PLAIN, 15));
		idLa.setBounds(100, 170, 100, 30);
		loginPanel.add(idLa);

		idTf.setBounds(200, 170, 150, 30);
		loginPanel.add(idTf);

		// �н�����
		passLa.setFont(new Font("���", Font.PLAIN, 15));
		passLa.setBounds(100, 220, 100, 30);
		loginPanel.add(passLa);

		passTf.setBounds(200, 220, 150, 30);
		loginPanel.add(passTf);

		// �α��� ��ư
		login.setBounds(190, 300, 100, 30);
		login.setFont(new Font("���", Font.PLAIN, 15));

		logindialog.setVisible(false);
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (logindialog.login(idTf.getText(), passTf.getText()) == "No") {
					logindialog.setVisible(true);
				} else {
//					str = logindialog.login(idTf.getText(), passTf.getText());
//					restr = logindialog.getStr();
//					// ���ο� �г�
//					d_4_main mPanel = new d_4_main();
					d_4_main_reeee mPanel = new d_4_main_reeee();
//					visible();
					loginPanel.setVisible(false);
					add(mPanel);
					mPanel.setVisible(true);
				}

			}
		});
		
		
		loginPanel.add(login);

		// ȸ������ ��ư
		signUp.setSize(100, 30);
		signUp.setFont(new Font("���", Font.PLAIN, 15));
		signUp.setLocation(350, 400);

		signUpdialog.setVisible(false);
		signUp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				signUpdialog.setVisible(true);
			}
		});

		loginPanel.add(signUp);
		add(loginPanel);

		
		//������ ��ġ ��Ű��
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dimen1 = getSize();
		int xpos = (int)(dimen.getWidth() /2  - dimen1.getWidth()/2);
		int ypos = (int)(dimen.getHeight() /2 - dimen1.getHeight()/2);
		
		setLocation(xpos, ypos);
		setResizable(false);
		setVisible(true);
		
	}

	public static void main(String[] args) throws Exception {
		new d_1_start();
	}

}
