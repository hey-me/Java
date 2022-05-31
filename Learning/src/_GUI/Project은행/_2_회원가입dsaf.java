package _GUI.Project����;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

public class _2_ȸ������dsaf extends JFrame {
	
	private JTextField nameTf;
	private JTextField telTf;
	private JTextField idTf;
	private JTextField passTf;
	
	String id = "";
	String password = "";
	String name = "";
	String tel = "";
	
	public _2_ȸ������dsaf() {
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel signUpLa = new JLabel("ȸ������");
		signUpLa.setBounds(117, 64, 57, 15);
		getContentPane().add(signUpLa);
		
		
		JLabel nameLa = new JLabel("�̸�");
		nameLa.setBounds(117, 98, 57, 15);
		getContentPane().add(nameLa);
		
		nameTf = new JTextField();
		nameTf.setBounds(205, 61, 116, 21);
		getContentPane().add(nameTf);
		nameTf.setColumns(10);
		
		
		JLabel telLa = new JLabel("��ȭ��ȣ");
		telLa.setBounds(117, 136, 57, 15);
		getContentPane().add(telLa);
		
		telTf = new JTextField();
		telTf.setBounds(205, 95, 116, 21);
		getContentPane().add(telTf);
		telTf.setColumns(10);
		
		JLabel idLa = new JLabel("���̵�");
		idLa.setFont(new Font("����", Font.PLAIN, 16));
		idLa.setBounds(182, 10, 91, 30);
		getContentPane().add(idLa);
		idTf = new JTextField();
		idTf.setBounds(205, 133, 116, 21);
		getContentPane().add(idTf);
		idTf.setColumns(10);
		
		JLabel passLa = new JLabel("��й�ȣ");
		passLa.setBounds(117, 175, 57, 15);
		getContentPane().add(passLa);
		
		passTf = new JTextField();
		passTf.setBounds(205, 172, 116, 21);
		getContentPane().add(passTf);
		passTf.setColumns(10);
		
		JButton okBtn = new JButton("Ȯ��");
		okBtn.setBounds(138, 212, 73, 23);
		okBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Container cn = getContentPane();
				boolean is = true;
				while(is) {
				try {
					if (nameTf.getText().isEmpty() || idTf.getText().isEmpty() || passTf.getText().isEmpty()
							|| telTf.getText().isEmpty()==true) {
						if (nameTf.getText().isEmpty()) {
							JLabel nameErr = new JLabel("�̸��� �Է��ϼ���!");
							nameErr.setFont(new Font("����", Font.PLAIN, 11));
							nameErr.setBounds(205, 80, 117, 15);
							cn.add(nameErr);
							cn.repaint();
						}
						if (idTf.getText().isEmpty()) {
							JLabel idErr = new JLabel("���̵� �Է��ϼ���!");
							idErr.setFont(new Font("����", Font.PLAIN, 11));
							idErr.setBounds(205, 120, 117, 15);
							cn.add(idErr);
							cn.repaint();
						}
						if (passTf.getText().isEmpty()) {
							JLabel passErr = new JLabel("��й�ȣ�� �Է��ϼ���!");
							passErr.setFont(new Font("����", Font.PLAIN, 11));
							passErr.setBounds(205, 160, 117, 15);
							cn.add(passErr);
							cn.repaint();
						}
						if (telTf.getText().isEmpty()) {
							JLabel telErr = new JLabel("��ȭ��ȣ�� �Է��ϼ���!");
							telErr.setFont(new Font("����", Font.PLAIN, 11));
							telErr.setBounds(205, 200, 117, 15);
							cn.add(telErr);
							cn.repaint();
						}
					} else {
						is = false;
						signup();
						setVisible(false);
					}
				} catch (Exception e1) {
				}
				}
			}

		});
		getContentPane().add(okBtn);
		
		JButton cancelBtn = new JButton("���");
		cancelBtn.setBounds(227, 212, 73, 23);
		cancelBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//���� ���������� ���ư��� �����?
			}
		});
		getContentPane().add(cancelBtn);
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

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
