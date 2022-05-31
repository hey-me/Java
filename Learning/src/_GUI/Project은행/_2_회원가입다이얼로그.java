

package _GUI.Project����;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class _2_ȸ�����Դ��̾�α� extends JDialog {

//	private Map<String, Customer> map = new HashMap<String, Customer>();
	private String id = "";
	private String password = "";
	private String name = "";
	private String tel = "";

	private JTextField nameTf = new JTextField(15);
	private JTextField idTf = new JTextField(15);
	private JTextField passTf = new JTextField(10);
	private JTextField telTf = new JTextField(10);

	JLabel nameErr = new JLabel("�̸��� �Է��ϼ���!");
	JLabel idErr = new JLabel("���̵� �Է��ϼ���!");
	JLabel passErr = new JLabel("��й�ȣ�� �Է��ϼ���!");
	JLabel telErr = new JLabel("��ȭ��ȣ�� �Է��ϼ���!");
	
	public _2_ȸ�����Դ��̾�α�(JFrame frame, String title) {
		super(frame, title);
//		setTitle("ȸ������");
//		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
		JLabel nameLa = new JLabel("Name");
		nameLa.setFont(new Font("����", Font.BOLD, 15));
		nameLa.setBounds(50, 50, 100, 30);
		c.add(nameLa);
		nameTf.setFont(new Font("����", Font.BOLD, 15));
		nameTf.setBounds(150, 50, 100, 30);
		c.add(nameTf);

		JLabel idLa = new JLabel("Id");
		idLa.setFont(new Font("����", Font.BOLD, 15));
		idLa.setBounds(50, 100, 100, 30);
		c.add(idLa);

		idTf.setBounds(150, 100, 130, 30);
		c.add(idTf);

		JLabel passLa = new JLabel("Password");
		passLa.setFont(new Font("����", Font.BOLD, 15));
		passLa.setBounds(50, 150, 100, 30);
		c.add(passLa);

		passTf.setBounds(150, 150, 130, 30);
		c.add(passTf);

		JLabel telLa = new JLabel("Tel");
		telLa.setFont(new Font("����", Font.BOLD, 15));
		telLa.setBounds(50, 200, 100, 30);
		c.add(telLa);

		telTf.setBounds(150, 200, 130, 30);
		c.add(telTf);

		//������ ��ĭ�϶� �߱�
		nameErr.setFont(new Font("����", Font.PLAIN, 11));
		nameErr.setBounds(155, 80, 120, 20);
		add(nameErr);
		nameErr.setVisible(false);
		idErr.setFont(new Font("����", Font.PLAIN, 11));
		idErr.setBounds(155, 130, 120, 20);
		add(idErr);
		idErr.setVisible(false);
		passErr.setFont(new Font("����", Font.PLAIN, 11));
		passErr.setBounds(155, 180, 120, 20);
		add(passErr);
		passErr.setVisible(false);
		telErr.setFont(new Font("����", Font.PLAIN, 11));
		telErr.setBounds(155, 230, 120, 20);
		add(telErr);
		telErr.setVisible(false);
		
		JButton okBtn = new JButton("Ȯ��");
		okBtn.setBounds(130, 250, 110, 30);
		okBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Container cn = getContentPane();
				try {
					if (nameTf.getText().isEmpty() || idTf.getText().isEmpty() || passTf.getText().isEmpty()
							|| telTf.getText().isEmpty() == true) {
						if (nameTf.getText().isEmpty()) {
							nameErr.setVisible(true);
							cn.repaint();
						} else {nameErr.setVisible(false);}
						if (idTf.getText().isEmpty()) {
							idErr.setVisible(true);
							cn.repaint();
						} else {idErr.setVisible(false);}
						if (passTf.getText().isEmpty()) {
							passErr.setVisible(true);
							cn.repaint();
						} else {passErr.setVisible(false);}
						if (telTf.getText().isEmpty()) {
							telErr.setVisible(true);
							cn.repaint();
						} else {telErr.setVisible(false);}
					} else {
						signup();
						setVisible(false);
					}
				} catch (Exception e1) {
				}
			}
		});
		c.add(okBtn);

		JButton cancelBtn = new JButton("���");
		cancelBtn.setBounds(145, 300, 75, 30);
		cancelBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		c.add(cancelBtn);

		setSize(400	, 420);
		setVisible(true);
	}

	void signup() throws Exception {

		name = nameTf.getText();
		id = idTf.getText();
		password = passTf.getText();
		tel = telTf.getText();

		File customerID = new File("C:/JavaSF/workspace/JavaSF/����/" + id + "," + password);
		if (!customerID.exists()) {
			customerID.mkdirs();
		}
		OutputStream os = new FileOutputStream("C:/JavaSF/workspace/JavaSF/����/" + id + "," + password + "/������.txt");
		Writer writer = new OutputStreamWriter(os);

		Map<String, ex_Customer> map = new HashMap<String, ex_Customer>();
		map.put(name, new ex_Customer(id, password, tel));

		writer.write("�̸�:" + name + "\n");
		writer.write("ID:" + id + "\n");
		writer.write("PASSWORD:" + password + "\n");
		writer.write("Tel:" + password + "\n");

		writer.flush();
		writer.close();

	}

}
