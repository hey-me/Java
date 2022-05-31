package _GUI.Project����;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;


public class _������Ʈ extends JFrame {

	Container c = getContentPane();
	JPanel loginPanel = new JPanel();
//	loginPanel=new LoginPanel(customer.idTf.getText(),customer.passTf.getText());
	JLabel first = new JLabel("�ڹ� ����");

	public _������Ʈ() throws Exception {
		setTitle("�ڹ� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		c.setLayout(null);
		first.setSize(100, 50);
		first.setFont(new Font("����ü", Font.BOLD, 15));
		first.setLocation(200, 30);
		c.add(first);

		CustomerComponent customer = new CustomerComponent();
		c.add(customer);
		loginPanel.setLayout(null);
		loginPanel.setSize(500, 500);
		loginPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					LoginPanel lp=new LoginPanel(customer.idTf.getText(),customer.passTf.getText());
					loginPanel.add(lp);
				} catch (Exception e1) {}
			}
		});
		c.add(loginPanel);
		setSize(500, 500);
		setVisible(true);

	}

	class CustomerComponent extends JPanel {

		JLabel idLa = new JLabel("ID");
		JTextField idTf = new JTextField(15);
		JLabel passLa = new JLabel("PASSWORD");
		JTextField passTf = new JTextField(10);
		JButton login = new JButton("�α���");
		JButton signUp = new JButton("ȸ�� ����");

		public CustomerComponent() {
			idLa.setSize(100, 30);
			idLa.setFont(new Font("����", Font.BOLD, 15));
			idLa.setLocation(100, 100);
			c.add(idLa);

			idTf.setSize(150, 30);
			idTf.setLocation(200, 100);
			c.add(idTf);

			passLa.setSize(100, 30);
			passLa.setFont(new Font("����", Font.BOLD, 15));
			passLa.setLocation(100, 150);
			c.add(passLa);

			passTf.setSize(150, 30);
			passTf.setLocation(200, 150);
			c.add(passTf);

			login.setSize(100, 30);
			login.setFont(new Font("����", Font.BOLD, 15));
			login.setLocation(190, 250);
			c.add(login);

			signUp.setSize(120, 30);
			signUp.setFont(new Font("����", Font.BOLD, 15));
			signUp.setLocation(180, 300);
			c.add(signUp);

			signUp.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new _2_ȸ������();
				}
			});

		}
	}

	class LoginPanel extends JPanel {
		String name;
		String id;
		String password;
		String tel;
		JLabel la = new JLabel("id�� password�� Ȯ���ϼ���.");
		JLabel bel = new JLabel("��ϵ��� �ʾҽ��ϴ�.");
		Container lp = getContentPane();

		public LoginPanel(String id, String password) throws Exception {

			if (id == null || password == null) {
				la.setSize(100, 30);
				la.setLocation(400, 400);
				lp.add(la);
			} else {
				this.id = id;
				this.password = password;
				Login login = new Login(id, password);
				String str = login.idread(id, password);
				if (str == "����") {
					bel.setSize(100, 30);
					bel.setLocation(400, 500);
					lp.add(bel);
				} else {
					setTitle(str);
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new _������Ʈ();
	}

}
